package com.alura;


import java.util.ArrayList;

public class Clase2 {
    
        public static void main(String[] args) {
            String varibale1 = "Clase 1";
            String variable2 = "Clase 2";
            String variable3 = "Clase 3";

            ArrayList<String> lista = new ArrayList<String>();
            lista.add(varibale1);
            lista.add(variable2);
            lista.add(variable3);

            System.out.println(lista);

            /* for tradicional */
            // for (int i = 0; i < lista.size(); i++) {
            //     System.out.println(lista.get(i));
            // }

            /* for tipo forEach */
            // for (String clase : lista) {
            //     System.out.println(clase);
            // }

            /* forEach de una lina, a partir de java 8 */
            lista.forEach(clase -> System.out.println(clase));
        }
}
