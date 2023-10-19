package com.xjgv.app.jardin;

import com.xjgv.app.hogar.*;

import static com.xjgv.app.hogar.ColorPelo.*;
import static com.xjgv.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Javier");
        System.out.println(p.getNombre());
        p.setColorPelo(NEGRO);

        Perro perro = new Perro();
        perro.nombre = "Sunny";
        perro.raza = "Pitbull";

        System.out.println(perro);
        String jugando = perro.jugar(p);
        System.out.println(jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        System.out.println(generoMujer);
        System.out.println(generoHombre);
    }
}
