package com.ejercicios.semana11;

public class Perfil {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    private String telefono;


    public Perfil(String nombre, String apellido1, String apellido2, int edad, String telefono){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 =  apellido2;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Perfil() {

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1(){
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2(){
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
