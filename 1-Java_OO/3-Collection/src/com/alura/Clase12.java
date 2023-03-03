package com.alura;

import java.util.*;

public class Clase12 {
    public static void main(String[] args) {
        String alummo1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Guastavo Sanchez";
        String alumno6 = "Marcia Maria";

        // set no tiene orden, es como un circulo
        // se evitan objetos duplicados
        Collection<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alummo1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for (String alumno : listaAlumnos) {
            System.out.println(alumno);
        }

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }
}
