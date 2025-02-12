package com.example.pruebasSec.service;

import com.example.pruebasSec.dto.CreateUserDto;
import com.example.pruebasSec.model.User;
import com.example.pruebasSec.model.UserRole;
import com.example.pruebasSec.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public User createUser(CreateUserDto createUserDto) {

        User user = User.builder()
                .username(createUserDto.username())
                .password(passwordEncoder.encode(createUserDto.password()))
                .roles(Set.of(UserRole.USER))
                .build();
        return userRepository.save(user);

    }
    /*

    public Optional<User> edit(UUID id, User user) {

        return userRepository.findById(id).map(
                user1 -> {
                    user1.setUsername(user.getUsername());
                    user1.setAvatar(user.getAvatar());
                    user1.setFullName(user.getFullName());
                    user1.setCreatedAt(user.getCreatedAt());
                    return userRepository.save(user1);
                }
        ).or(() -> Optional.empty());
    }

    public Optional<User> editPassword(UUID id, String newPassword) {
        return userRepository.findById(id)
                .map(u -> {
                    u.setPassword(passwordEncoder.encode(newPassword));
                    return userRepository.save(u);
                }).or(() -> Optional.empty());
    }

    public void delete(UUID id) {
        userRepository.deleteById(id);
    }


     */

}