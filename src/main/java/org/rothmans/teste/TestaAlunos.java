package org.rothmans.teste;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Virginio");
        alunos.add("Alberto Solsa");
        alunos.add("Nico Hobin");
        alunos.add("Juliana Silva");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        for(String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);
    }
}
