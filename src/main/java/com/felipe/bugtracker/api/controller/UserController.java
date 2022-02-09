package com.felipe.bugtracker.api.controller;

import com.felipe.bugtracker.domain.dto.response.MessageResponseDTO;
import com.felipe.bugtracker.domain.model.Users;
import com.felipe.bugtracker.domain.repository.UserRepository;
import com.felipe.bugtracker.domain.service.UsersService;
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
    private UsersService usersService;


//    @GetMapping
//    public List<Users> list(){
//        return userRepository.findAll();
//    }
    /* Esse get retornar uma lista com todos os dados que estão no banco de dados.
       É um método para certificar que os dados estão sendo armazenados e que deve ser
       removido quando a aplicação estiver completa.
    * */


    @PostMapping("/create")
    public MessageResponseDTO create(@Valid @RequestBody Users users){
      return create(users);
    }


}
