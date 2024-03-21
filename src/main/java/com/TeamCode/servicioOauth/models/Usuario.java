package com.TeamCode.servicioOauth.models;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String celular;
    private String dni;
    private Boolean enabled;
    private Integer intentos;
    private List<Role> roles;
    private String pais;
    private String codigoDeLlamada;
}
