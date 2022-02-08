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
    @Column(name="codigo")
    private Long Codigo;

    @Size(max=50)
    @NotEmpty
    @Column(name="nome")
    private String Nome;

    @Size(max = 255)
    @Email
    @NotEmpty
    @Column(name="email")
    private String Email;

    @Size(min = 8 , max = 10)
    @NotEmpty
    @Column(name="senha")
    private String Senha;

    @Size(max =6)
    @NotEmpty
    @Column(name = "tipo")
    private String Tipo;
}
