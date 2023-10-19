package com.xjgv.app.hogar;

import com.xjgv.app.jardin.Perro;

import static com.xjgv.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();

        String saludo = saludar();
    }
}
