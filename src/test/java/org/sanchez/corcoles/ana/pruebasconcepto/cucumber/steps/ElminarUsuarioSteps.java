package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;

public class ElminarUsuarioSteps {

    private GestionUsuarios gestionUsuarios;

    private boolean resultado;

    public ElminarUsuarioSteps(){
        gestionUsuarios = GestionUsuariosSingleton.getInstance();
    }

    @When("^Eliminamos el usuario con id: (\\d+)$")
    public void eliminarUsuarioConId(final String idUsuario) throws Throwable {
        resultado = gestionUsuarios.eliminarUsuario(idUsuario);
    }

    @Then("^Nos devuelve un booleano con el valor true$")
    public void borradoDeUsuarioOK() throws Throwable {
        Assert.assertEquals(resultado, true);
    }

    @Then("^Nos devuelve un booleano con el valor false$")
    public void borradoDeUsuarioKO() throws Throwable {
        Assert.assertEquals(resultado, false);
    }

}
