package com.edutech.usuarios.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Integer id;
    private String nombre;
    private String correo;
    private Integer rolId;
}