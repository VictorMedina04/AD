package com.example.pruebasSec.dto;

public record CreateUserDto(
        String username,
        String password,
        String verifyPassword
) {
}
