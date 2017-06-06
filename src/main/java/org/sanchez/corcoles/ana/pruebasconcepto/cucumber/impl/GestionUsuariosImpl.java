package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.impl;


import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestionUsuariosImpl implements GestionUsuarios {

    List<Usuario> usuarios;

    public GestionUsuariosImpl(){
        usuarios = new ArrayList<Usuario>();
    }

    public String crearUsuario(Usuario usuario) {
        if(getUsuario(usuario.getId())==null){
            usuarios.add(usuario);
            return usuario.getId();
        }
        return null;
    }

    public Boolean eliminarUsuario(String id) {
        final Usuario usuario = getUsuario(id);
        if(usuario!=null){
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    public Usuario getUsuario(String id) {
        for(final Usuario usuario : usuarios){
            if(usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getListaUsuarios(){
        return usuarios;
    }
}
