package org.sanchez.corcoles.ana.pruebasconcepto.cucumber;


import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto.Usuario;

import java.util.List;

public interface GestionUsuarios {

    String crearUsuario(Usuario usuario);

    Boolean eliminarUsuario(String id);

    Usuario getUsuario(String id);

    List<Usuario> getListaUsuarios();

}
