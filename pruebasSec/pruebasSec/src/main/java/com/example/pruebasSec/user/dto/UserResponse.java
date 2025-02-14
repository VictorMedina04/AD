package com.example.pruebasSec.user.dto;

import com.example.pruebasSec.user.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String username,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        String token
) {
<<<<<<< HEAD
=======

>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
    public static UserResponse of (User user) {
        return new UserResponse(user.getId(), user.getUsername(), null);
    }

    public static UserResponse of (User user, String token) {
        return new UserResponse(user.getId(), user.getUsername(), token);
    }
<<<<<<< HEAD
=======

>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
}