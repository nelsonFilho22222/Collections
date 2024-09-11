package org.rothmans;

import java.util.*;

public class TestaCruso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as Coleções do Java",
                "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(aulas);
        System.out.println(javaColecoes.getAulas());

    }
}


