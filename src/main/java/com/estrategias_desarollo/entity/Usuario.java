package com.estrategias_desarollo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la tabla "usuario".
 */
@Entity
@Data
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "cedula")
    private String cedula;

    @Column(name = "primernombre")
    private String primerNombre;

    @Column(name = "segundonombre")
    private String segundoNombre;

    @Column(name = "primerapellido")
    private String primerApellido;

    @Column(name = "segundoapellido")
    private String segundoApellido;

    @Column(name = "clave")
    private String clave;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "nitempresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "rol")
    private Rol rol;

    @Column(name = "estado")
    private Integer estado;
}
