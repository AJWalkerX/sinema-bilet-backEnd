package com.ajwalker.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterRequestDto(
        @Size(min = 3, max = 40)
        String name,
        @NotNull
        @Email
        String email,
        @NotNull
        @Size(min = 8, max = 64)
        @Pattern(
                message = "Şifreniz en az 8 en fazla 64 karakter olmalı, Şirenizde En az Bir büyük bir küçük harf ve özel karakter olmalıdır.",
                regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*!])(?=\\S+$).{8,}$")
        String password,
        String rePassword

) {
}
