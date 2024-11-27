package com.ajwalker.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ESessionHours {


    OGLE("14:30"),
    AFTERNOON("17:30"),
    EVENING("20:30");

    private final String name;
}
