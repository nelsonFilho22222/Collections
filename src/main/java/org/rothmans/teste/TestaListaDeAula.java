package org.rothmans.teste;

import org.rothmans.principal.Aula;

import java.util.*;

public class TestaListaDeAula {
    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));


    }
}
