package com.estrategias_desarollo.repository;

import com.estrategias_desarollo.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio JPA para la entidad "Usuario".
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
