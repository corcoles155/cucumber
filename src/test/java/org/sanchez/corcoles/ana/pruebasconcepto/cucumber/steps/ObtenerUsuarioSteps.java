package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ObtenerUsuarioSteps {

    private GestionUsuarios gestionUsuarios;

    private Usuario resultado;

    public ObtenerUsuarioSteps(){
        gestionUsuarios = GestionUsuariosSingleton.getInstance();
    }

    @Given("^un usuario creado con el id (\\d+)$")
    public void crearUsuarioConElId(final String idUsuario) throws Throwable {
        gestionUsuarios.crearUsuario(new Usuario(idUsuario, "Ana", "Córcoles", 26));
    }

    @When("^Introducimos el valor del id del usuario: (\\d+)$")
    public void obtenerUsuarioConElId(final String idUsuario) throws Throwable {
        resultado = gestionUsuarios.getUsuario(idUsuario);
    }

    @Then("^Nos devuelve el usuario <entrada>$")
    public void nos_devuelve_el_usuario_entrada(final DataTable dataTable) throws Throwable {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(resultado);
        dataTable.diff(usuarios);
    }


}
