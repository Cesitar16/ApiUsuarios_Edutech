package com.edutech.usuarios.dto;

import java.time.LocalDate;
import lombok.Data;

@Data
public class CrearUsuarioRequest {
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private LocalDate fechaNacimiento;
    private String telefono;
    private String direccion;
    private Integer rolId;
    private Integer comunaId;
}