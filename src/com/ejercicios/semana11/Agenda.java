package com.ejercicios.semana11;


public class Agenda {
    private Perfil[] perfiles;
    private int contador;

    public Agenda() {
        perfiles = new Perfil[3];
        contador = 0;
    }

    public void addPerfil(Perfil perfil) throws ArrayIndexOutOfBoundsException{
        if (contador >= perfiles.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println("Contacto guardado");
            perfiles[contador] = perfil;
            contador++;
        }
    }


    public void recorreragenda() {
        for (int i = 0; i < perfiles.length; i++) {
            if (perfiles[i] != null) {
                System.out.println("Nombre: " + perfiles[i].getNombre() + ", primer apellido: " + perfiles[i].getApellido1() + ", segundo apellido " +
                        perfiles[i].getApellido2() + ", edad " + perfiles[i].getEdad() + " numero de telefono " + perfiles[i].getTelefono());
            }
        }
    }

}