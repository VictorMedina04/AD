package com.example.pruebasSec.user.service;

<<<<<<< HEAD
import com.example.pruebasSec.user.dto.CreateUserRequest;
import com.example.pruebasSec.user.dto.UserResponse;
=======
import com.example.pruebasSec.user.dto.CreateUserDto;
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
import com.example.pruebasSec.user.model.User;
import com.example.pruebasSec.user.model.UserRole;
import com.example.pruebasSec.user.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }

<<<<<<< HEAD
    public User createUser(CreateUserRequest createUserDto) {
=======
    public User createUser(CreateUserDto createUserDto) {
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b

        User user = User.builder()
                .username(createUserDto.username())
                .password(passwordEncoder.encode(createUserDto.password()))
                .roles(Set.of(UserRole.USER))
                .build();
        return userRepository.save(user);

    }

<<<<<<< HEAD

=======
>>>>>>> c3a8defcf2f7ec64680fb3a62dfe55b850e1778b
}