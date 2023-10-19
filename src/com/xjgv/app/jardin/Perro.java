package com.xjgv.app.jardin;
import com.xjgv.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

    @Override
    public String toString() {
        return nombre + " " + raza;
    }
}
