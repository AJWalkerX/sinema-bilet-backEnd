package com.ajwalker.controller;

import com.ajwalker.dto.request.LoginRequestDto;
import com.ajwalker.dto.request.RegisterRequestDto;
import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.User;
import com.ajwalker.exceptions.ErrorType;
import com.ajwalker.exceptions.SinemaBiletException;
import com.ajwalker.service.UserService;
import com.ajwalker.utility.JwtManager;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

import static com.ajwalker.constants.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER)
@CrossOrigin("*")
public class UserController {
    private final UserService userService;
    private final JwtManager jwtManager;

    @PostMapping(REGISTER)
    public ResponseEntity<BaseResponse<Boolean>> register(@RequestBody @Valid RegisterRequestDto dto) {
        if(!dto.password().equals(dto.rePassword())) throw new SinemaBiletException(ErrorType.PASSWORDS_DO_NOT_MATCH);
        return ResponseEntity.ok(BaseResponse.<Boolean>builder()
                        .code(200)
                        .message("Onay linki email adresinize gönderildi!")
                        .success(true)
                        .data(userService.register(dto))
                .build());
    }

    @PostMapping(LOGIN)
    public ResponseEntity<BaseResponse<String>> login(@RequestBody @Valid LoginRequestDto dto) {
        return ResponseEntity.ok(BaseResponse.<String>builder()
                .code(200)
                .message("Üye kaydı başarı ile oluşturuldu.")
                .success(true)
                .data(userService.login(dto))
                .build());
    }

     @GetMapping(AUTHMAIL)
    public ResponseEntity<Void> authUser(@RequestParam(name = "auth") String token){
         Optional<Long> optionalLong = jwtManager.validateToken(token);
         if(optionalLong.isEmpty()){
             throw new SinemaBiletException(ErrorType.USER_NOTFOUND);
         }
         userService.updateUserState(optionalLong.get());
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("http://localhost:3000/login"));
        return new ResponseEntity<>(headers, HttpStatus.FOUND);
     }
}
