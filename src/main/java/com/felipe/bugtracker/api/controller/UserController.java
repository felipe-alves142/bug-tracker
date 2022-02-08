package com.felipe.bugtracker.api.controller;

import com.felipe.bugtracker.domain.model.Users;
import com.felipe.bugtracker.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Users> list(){
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public Users create(@Valid @RequestBody Users users){
      return userRepository.save(users);
    }
}
