package com.diego.condominio.web.dto.mapper;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDto {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String email;
    private String senha;

}
