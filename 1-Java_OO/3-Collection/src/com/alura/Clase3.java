package com.alura;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<String>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        // System.out.println(cursos);

        // Collections.sort(cursos);
        // System.out.println(cursos);

        // Collections.sort(cursos, Collections.reverseOrder());
        // System.out.println(cursos);

        cursos.sort(Collections.reverseOrder());
        // cursos.sort(Comparator.naturalOrder());

        // cursos.stream().sorted(Comparator.reverseOrder()).forEach(curso -> System.out.println(curso));
        System.out.println(cursos);

        List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList);
    }
}
