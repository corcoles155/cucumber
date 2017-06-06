package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.steps;


import cucumber.api.java.en.Given;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.GestionUsuarios;
import org.sanchez.corcoles.ana.pruebasconcepto.cucumber.impl.GestionUsuariosImpl;

public class GestionUsuariosSingleton {

    private static GestionUsuarios gestionUsuarios;

    public GestionUsuariosSingleton(){
        super();
    }

    @Given("^Tenemos la clase GestionUsuarios inicializada$")
    public void inicializarGestionDeUsuarios() throws Throwable {
        gestionUsuarios = getInstance();
    }

    public static GestionUsuarios getInstance(){
        if(gestionUsuarios==null){
            gestionUsuarios = new GestionUsuariosImpl();
        }
        return gestionUsuarios;
    }
}
