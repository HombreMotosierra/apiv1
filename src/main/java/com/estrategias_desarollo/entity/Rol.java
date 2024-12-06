package com.estrategias_desarollo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la tabla "rol".
 */
@Entity
@Data
@Table(name = "roles")
public class Rol {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name ="rol")
    private String rol;

    @Column(name = "estado")
    private Integer estado;

    @Column(name = "descripcion")
    private String descripcion;


}
