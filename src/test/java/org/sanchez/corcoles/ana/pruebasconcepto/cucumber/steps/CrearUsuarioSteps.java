package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto.Usuario;

import java.util.List;

public class CrearUsuarioSteps {

    private GestionUsuarios gestionUsuarios;

    private String resultado;

    public CrearUsuarioSteps(){
        gestionUsuarios = GestionUsuariosSingleton.getInstance();
    }

    @When("^Introducimos los datos del usuario que queremos crear: <entrada>$")
    public void introducirDatosUsuario(final List<Usuario> usuarios) throws Throwable {
        resultado = gestionUsuarios.crearUsuario(usuarios.get(0));
    }

    @Then("^El id del usuario creado es (\\d+)$")
    public void crearUsuarioOK(String idUduarioCreado) throws Throwable {
        Assert.assertEquals(resultado, idUduarioCreado);
    }

    @Then("^Nos devuelve null$")
    public void crearUsuarioKO() throws Throwable {
        Assert.assertEquals(resultado, null);
    }

}
