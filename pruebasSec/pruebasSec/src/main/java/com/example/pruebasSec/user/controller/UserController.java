package com.example.pruebasSec.user.controller;

import com.example.pruebasSec.security.jwt.access.JwtService;
<<<<<<< HEAD
import com.example.pruebasSec.user.dto.CreateUserRequest;
=======
import com.example.pruebasSec.user.dto.CreateUserDto;
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
import com.example.pruebasSec.user.dto.LoginRequest;
import com.example.pruebasSec.user.dto.UserResponse;
import com.example.pruebasSec.user.model.User;
import com.example.pruebasSec.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
<<<<<<< HEAD
=======
@RequestMapping("/user")
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
public class UserController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @PostMapping("/auth/register")
<<<<<<< HEAD
    public ResponseEntity<UserResponse> register(@RequestBody CreateUserRequest createUserRequest) {
=======
    public ResponseEntity<UserResponse> register(@RequestBody CreateUserDto createUserRequest) {
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
        User user = userService.createUser(createUserRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UserResponse.of(user));
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {

<<<<<<< HEAD
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.username(),
                        loginRequest.password()
                ));
=======

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                loginRequest.username(),
                                loginRequest.password()
                        )
                );
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b

        SecurityContextHolder.getContext().setAuthentication(authentication);

        User user = (User) authentication.getPrincipal();

        String accessToken = jwtService.generateAccessToken(user);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UserResponse.of(user, accessToken));

    }

    @GetMapping("/me")
    public UserResponse me(@AuthenticationPrincipal User user) {
        return UserResponse.of(user);
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
