package com.ajwalker.service;

import com.ajwalker.constants.RestApis;
import com.ajwalker.dto.request.LoginRequestDto;
import com.ajwalker.dto.request.RegisterRequestDto;
import com.ajwalker.entity.User;
import com.ajwalker.exceptions.ErrorType;
import com.ajwalker.exceptions.SinemaBiletException;
import com.ajwalker.repository.UserRepository;
import com.ajwalker.utility.JwtManager;
import com.ajwalker.utility.enums.UserStates;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.awt.geom.RectangularShape;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    final UserRepository userRepository;
    final JwtManager jwtManager;
    final PasswordEncoder passwordEncoder;
    final MailService mailService;

    public Boolean register(RegisterRequestDto dto) {
        User user = userRepository.save(User.builder()
                    .email(dto.email())
                    .name(dto.name())
                    .password(passwordEncoder.encode(dto.password()))
                    .State(UserStates.PENDING)
                    .build());
        String token = jwtManager.createToken(user.getId());
        String verificationLink = "http://localhost:9090/v1/dev/user/auth-mail?id=" + token;
        mailService.sendMail(user.getEmail(), "Email authantication", verificationLink);
        return true;
    }

    public String login(LoginRequestDto dto) {
        Optional<User> userOptional = userRepository.findByEmailAndPassword(dto.email(),dto.password());
        if(userOptional.isEmpty()) throw new SinemaBiletException(ErrorType.WRONG_MAIL_OR_PASSWORD);
        return jwtManager.createToken(userOptional.get().getId());
    }
}
