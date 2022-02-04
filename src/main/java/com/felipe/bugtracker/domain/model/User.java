package com.felipe.bugtracker.domain.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class User {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Codigo")
    private Long id;

    @NotBlank
    @Size(max=50)
    @Column(name="Nome")
    private String nome;

    @NotBlank
    @Size(max = 255)
    @Email
    @Column(name="Email")
    private String email;

    @NotBlank
    @Size(min = 8 , max = 10)
    @Column(name="Senha")
    private String senha;

    @NotBlank
    @Size(max = 6)
    @Column(name="TipoUser")
    private String tipoUser;
}
