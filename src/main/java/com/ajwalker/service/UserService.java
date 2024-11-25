package com.ajwalker.service;

import com.ajwalker.dto.request.LoginRequestDto;
import com.ajwalker.dto.request.RegisterRequestDto;
import com.ajwalker.entity.User;
import com.ajwalker.exceptions.ErrorType;
import com.ajwalker.exceptions.SinemaBiletException;
import com.ajwalker.repository.UserRepository;
import com.ajwalker.utility.JwtManager;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    final UserRepository userRepository;
    final JwtManager jwtManager;

    public User register(RegisterRequestDto dto) {
            return userRepository.save(User.builder()
                    .email(dto.email())
                    .name(dto.name())
                    .password(dto.password())
                    .build());

    }

    public String login(LoginRequestDto dto) {
        Optional<User> userOptional = userRepository.findByEmailAndPassword(dto.email(),dto.password());
        if(userOptional.isEmpty()) throw new SinemaBiletException(ErrorType.WRONG_MAIL_OR_PASSWORD);
        return jwtManager.createToken(userOptional.get().getId());
    }
}
