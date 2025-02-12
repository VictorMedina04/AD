package com.example.pruebasSec.controller;

import com.example.pruebasSec.dto.CreateUserDto;
import com.example.pruebasSec.dto.UserResponse;
import com.example.pruebasSec.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
/*
    @GetMapping
    public List<GetUserDto> getAll() {
        return userService.findAll().stream().map(GetUserDto::of).toList();
    }

    @GetMapping("/{id}")
    public GetUserDto getById(@PathVariable UUID id) {
        return GetUserDto.of(userService.findById(id).get());
    }

 */

    @PostMapping
    public ResponseEntity<UserResponse> register (@RequestBody CreateUserDto createUserDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UserResponse.of(userService.createUser(createUserDto)));
    }

    /*
    @PutMapping("/{id}")
    public GetUserDto editUser(@PathVariable UUID id, @RequestBody User user){

    }
    */

}
