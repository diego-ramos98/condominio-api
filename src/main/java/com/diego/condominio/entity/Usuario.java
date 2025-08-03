package com.diego.condominio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome",length = 150)
    private String nome;

    @Column(name = "Data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cpf",length = 11)
    private String cpf;

    @Column(name = "email",length = 60,unique = true)
    private String email;

    @Column(name = "senha",length = 200)
    private String senha;

    @Enumerated
    @Column(name = "perfil_usuario",nullable = false,length = 20)
    private Perfil perfil = Perfil.PERFIL_PROPIETARIO;

    public enum Perfil{
        PERFIL_PROPIETARIO,
        PERFIL_INQUILINO,
        PERFIL_SINDICO
    }


}
