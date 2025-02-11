package com.example.pruebasSec.dto;

import com.example.pruebasSec.model.User;
import com.example.pruebasSec.model.UserRol;

import java.time.LocalDateTime;
import java.util.List;

public record GetUserDto(
        String username,
        String password,
        String avatar,
        String fullName,
        LocalDateTime createdAt
) {
    public static GetUserDto of(User user) {
        return new GetUserDto(
                user.getUsername(),
                user.getPassword(),
                user.getAvatar(),
                user.getFullName(),
                user.getCreatedAt()
        );
    }
}
