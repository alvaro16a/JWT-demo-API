package com.DEMOJWT.demo.controller;

import com.DEMOJWT.demo.model.Usuario;
import com.DEMOJWT.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }

    @PostMapping("/Usuarios")
    public Usuario crear(
            @Param("nombre") String nombre,
            @Param("clave") String clave
    ){
        Usuario usuario=new Usuario();
        usuario.setUserName(nombre);
        usuario.setClave(clave);
        usuarioRepository.save(usuario);
        return usuario;

    }

}
