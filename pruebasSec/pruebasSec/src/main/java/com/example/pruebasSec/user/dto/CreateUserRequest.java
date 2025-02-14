package com.example.pruebasSec.user.dto;

public record CreateUserRequest(
        String username, String password, String verifyPassword
) {
}