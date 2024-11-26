package com.ajwalker.controller;

import com.ajwalker.dto.request.LoginRequestDto;
import com.ajwalker.dto.request.RegisterRequestDto;
import com.ajwalker.dto.response.BaseResponse;
import com.ajwalker.entity.User;
import com.ajwalker.exceptions.ErrorType;
import com.ajwalker.exceptions.SinemaBiletException;
import com.ajwalker.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.ajwalker.constants.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER)
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

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
}
