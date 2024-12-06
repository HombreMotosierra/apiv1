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

    public Empresa(String nit, String nombre, Integer estado) {
        this.nit = nit;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Empresa() {
    }

    @Id
    @Column(name = "nit")
    private String nit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private Integer estado;
}
