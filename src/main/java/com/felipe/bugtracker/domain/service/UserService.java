package com.felipe.bugtracker.domain.service;

import com.felipe.bugtracker.domain.dto.response.MessageResponseDTO;
import com.felipe.bugtracker.domain.model.Users;
import com.felipe.bugtracker.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@Service
public class UserService {



    private UserRepository userRepository;

    /**
     * Nessa classe implementei a regra de negocio que será usada na hora do cadastro do
     * cliente. Dessa forma nossa classe cliente pássara de uma ter um filtro onde só será aceito
     * aquele que seguir a regra.
     */


    @Transactional
    public MessageResponseDTO salvar(Users users){
        boolean emailEmUso = userRepository.findByEmail(users.getEmail())
                .stream()
                .anyMatch(emailExistente -> !emailExistente.equals(users));

        if (emailEmUso){
           return MessageResponseDTO
                    .builder()
                    .message("Usuário ja cadastrado com esse email")
                    .build();
        }
        userRepository.save(users);
        return MessageResponseDTO
                .builder()
                .message("Usuário criado com sucesso!")
                .build();
    }
}
