package org.sanchez.corcoles.ana.pruebasconcepto.cucumber.dto;


public class Usuario {

    private String id;

    private String nombre;

    private String apellidos;

    private Integer edad;

    public String getId() {
        return id;
    }

    public Usuario(){
        super();
    }

    public Usuario(String id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
