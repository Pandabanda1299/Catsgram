package ru.yandex.practicum.catsgram.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = "email")
public class User {
    Long id;
    String username;
    String email;
    String password;
    long registrationDate;
}
