package ru.yandex.practicum.catsgram.exception;

import lombok.Getter;

public class ParameterNotValidException extends IllegalArgumentException {
    @Getter
    String parameter;

    @Getter
    String reason;
    public ParameterNotValidException (String parameter, String reason) {
        this.parameter = parameter;
        this.reason = reason;
    }
}