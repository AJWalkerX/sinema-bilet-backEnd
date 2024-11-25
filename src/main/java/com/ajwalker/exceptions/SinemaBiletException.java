package com.ajwalker.exceptions;

import lombok.Getter;

@Getter
public class SinemaBiletException extends RuntimeException {
    private ErrorType errorType;
    public SinemaBiletException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
}
