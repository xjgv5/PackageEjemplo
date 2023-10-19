package com.xjgv.app;

import com.xjgv.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Javier";
        System.out.println(p.nombre);
        Gato g = new Gato();
        Perro perro = new Perro();
        perro.nombre = "Sunny";
        perro.raza = "Pitbull";
        System.out.println(perro);
    }
}
