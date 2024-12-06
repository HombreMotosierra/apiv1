package com.estrategias_desarollo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la tabla "empresa".
 */
@Entity
@Data
@Table(name = "empresa")
public class Empresa {

    @Id
    @Column(name = "nit")
    private String nit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Integer estado;
}
