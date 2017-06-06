package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto.Usuario;

import java.util.ArrayList;
import java.util.List;

public class CrearUsuarioSteps {

    private GestionUsuarios gestionUsuarios;

    public CrearUsuarioSteps(){
        gestionUsuarios = GestionUsuariosSingleton.getInstance();
    }

    private List<String> resultado = new ArrayList<String>();

    @When("^Introducimos los datos del usuario que queremos crear: <entrada>$")
    public void introducirDatosUsuario(final List<Usuario> usuarios) throws Throwable {
        for(final Usuario usuario : usuarios){
            resultado.add(gestionUsuarios.crearUsuario(usuario));
        }
    }

    @Then("^Nos devuelve el id del usuario creado:$")
    public void debeDevolverElIdDelUsuarioCreado(final List<String> idUduarioCreado) throws Throwable {
        Assert.assertEquals(resultado, idUduarioCreado);
    }

}
