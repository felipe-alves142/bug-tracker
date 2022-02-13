package com.felipe.bugtracker.domain.model;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Size(max=50)
    @NotEmpty
    private String nome;

    @Size(max = 255)
    @Email
    @NotEmpty
    private String email;

    @Size(min = 8 , max = 10)
    @NotEmpty
    private String senha;

    @Size(max =6)
    @NotEmpty
    private String tipo;
}
