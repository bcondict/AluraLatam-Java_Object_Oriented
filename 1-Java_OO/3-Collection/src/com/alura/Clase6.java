package com.alura;

import java.util.ArrayList;

import com.alura.model.Aula;
import com.alura.model.Curso;

public class Clase6 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());
    }
}
