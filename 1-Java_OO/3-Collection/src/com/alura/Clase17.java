package com.alura;

import java.util.Iterator;

// import java.util.*;

import com.alura.model.Alumno;
import com.alura.model.Curso;

public class Clase17 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historio", 30);

        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno alumno3 = new Alumno("Pedro Pedrito", "003");
        Alumno alumno4 = new Alumno("Juan Carlos", "004");
        Alumno alumno5 = new Alumno("Guastavo Sanchez", "005");
        Alumno alumno6 = new Alumno("Marcia Maria", "006");
        Alumno alumno7 = new Alumno("Claudia Patricia", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        // curso1.getAlumnos().forEach(alumno -> {
        //     System.out.println(alumno);
        // });

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        alumnoIterator.hasNext();
        while (alumnoIterator.hasNext()) {
            System.out.println(alumnoIterator.next());
        }
    }
}
