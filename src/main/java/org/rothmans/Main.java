package org.rothmans;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aula1 = "Modelando a classe aula.\n" , aula2 = "Conhecendo mais de listas.\n",
                aula3 = "Trabalhando com Cursos e Sets.\n";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1 + aula2 + aula3);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("FOR COM STRING Aula " + aula);
        }

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("FOR COM INTREIRO Aula " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("FOREACH");
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });
    }
}