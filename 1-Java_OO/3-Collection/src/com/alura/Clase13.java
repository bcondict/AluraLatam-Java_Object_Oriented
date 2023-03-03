package com.alura;

import java.util.*;

public class Clase13 {
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

        // listaAlumnos.forEach(alumno -> {
        //     System.out.println(alumno);
        // });

        // boolean valida = listaAlumnos.contains("Pedro pedrito");

        // listaAlumnos.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(max.length());

        listaAlumnos.removeIf(alumno -> "Pedro Pedrito".equalsIgnoreCase(alumno));
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }
}
