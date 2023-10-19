package com.xjgv.app.jardin;

import com.xjgv.app.hogar.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Javier");
        System.out.println(p.getNombre());
        Perro perro = new Perro();
        perro.nombre = "Sunny";
        perro.raza = "Pitbull";
        System.out.println(perro);
        String jugando = perro.jugar(p);
        System.out.println(jugando);
    }
}
