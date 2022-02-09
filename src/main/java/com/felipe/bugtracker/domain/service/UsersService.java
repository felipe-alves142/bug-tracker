package com.felipe.bugtracker.domain.service;

import com.felipe.bugtracker.domain.dto.response.MessageResponseDTO;
import com.felipe.bugtracker.domain.model.Users;
import com.felipe.bugtracker.domain.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private UserRepository userRepository;

    public MessageResponseDTO create(Users users){

        boolean emailEmUso = userRepository.findByEmail(users.getEmail())
                .stream()
                .anyMatch(emailExistente -> !emailExistente.equals(users));

        String msg = null;
        if(emailEmUso){
            msg = "Usuário já cadastrado com esse email";
        }

        userRepository.save(users);
        msg = "Usuário criado com sucesso";


        return MessageResponseDTO
                .builder()
                .message(msg)
                .build();

    }
}
