package com.example.pruebasSec.user.dto;

public record CreateUserDto(
        String username,
        String password,
        String verifyPassword
) {
}
