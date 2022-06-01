package com.DEMOJWT.demo.repository;

import com.DEMOJWT.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
