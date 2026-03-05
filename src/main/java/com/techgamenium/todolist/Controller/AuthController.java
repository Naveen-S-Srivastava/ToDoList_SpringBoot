package com.techgamenium.todolist.Controller;

import com.techgamenium.todolist.Model.User;
import com.techgamenium.todolist.Repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    public Object register(@RequestBody User user) {
        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            return "Username already exists";
        }
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        Optional<User> existingUser =
                userRepository.findByUsername(user.getUsername());

        if (existingUser.isPresent() &&
                existingUser.get().getPassword().equals(user.getPassword())) {

            return "Login successful";
        }

        return "Invalid username or password";
    }
    private final PasswordEncoder passwordEncoder;


}