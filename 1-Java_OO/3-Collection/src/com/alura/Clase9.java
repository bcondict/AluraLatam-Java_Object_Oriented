package com.alura;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
// import java.util.stream.Collectors;

// import com.alura.model.Aula;
import com.alura.model.Curso;

public class Clase9 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetrica", 20);
        Curso curso4 = new Curso("Geometria", 50);

        ArrayList<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        Collections.sort(cursos, Collections.reverseOrder());

        int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo += curso.getTiempo();
        }

        System.out.println(tiempo);

        // son equivalentes pero aca es una linea y se usa a partir de java 8
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
    }
}
