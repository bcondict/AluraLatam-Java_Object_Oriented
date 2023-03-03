package com.alura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// import com.alura.model.Aula;
// import com.alura.model.Curso;

public class Clase8 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };
    public static void main(String[] args) {
        for (List<Integer> lista : listas) {
            final String nombeImplementacion = lista.getClass().getSimpleName();
            // add
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            long duracion = fin - inicio;
            System.out.println(nombeImplementacion + " add: " + duracion);

            // get
            inicio = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombeImplementacion + " get: " + duracion  );

            // remove
            for (int i = 99999; i >= 100000; i--) {
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombeImplementacion + " remove: " + duracion  );

            // LINKEDLIST 
        }
    }
}
