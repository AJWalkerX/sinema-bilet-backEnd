package com.ajwalker.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_SERVER_ERROR(500,"Sunucuda beklenmeyen bir hata oldu. Lütfen tekrar deneyin",HttpStatus.INTERNAL_SERVER_ERROR),
    VALIDATION_ERROR(400,"girilen parametreler hatalıdır. Lütfen kontrol ederek tekrar deneyimn.", HttpStatus.BAD_REQUEST),
    WRONG_MAIL_OR_PASSWORD(1001,"Mail adresi ya da şifre hatalıdır",HttpStatus.BAD_REQUEST),
    PASSWORDS_DO_NOT_MATCH(1002,"Girilen şifreler uyuşmamaktadır",HttpStatus.BAD_REQUEST);



    int code;
    String message;
    HttpStatus httpStatus;
}
