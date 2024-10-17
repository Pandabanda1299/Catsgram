package ru.yandex.practicum.catsgram.controller;

import lombok.Getter;

@Getter
public class ErrorResponse {

    String error;
    public ErrorResponse(String error) {
        this.error = error;
    }
}