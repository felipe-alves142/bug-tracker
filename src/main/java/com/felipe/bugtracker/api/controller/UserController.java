package com.felipe.bugtracker.api.controller;

import com.felipe.bugtracker.domain.model.User;
import com.felipe.bugtracker.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String getUser(){
        return "Funciona";
    }

    @PostMapping("/create")
    public User createUser(@Valid @RequestBody User user){
       return userRepository.save(user);
    }
}
