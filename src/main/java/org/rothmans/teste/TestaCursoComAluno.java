package org.rothmans.teste;

import org.rothmans.principal.Aluno;
import org.rothmans.principal.Aula;
import org.rothmans.principal.Curso;

public class TestaCursoComAluno {

    public static void main (String[] args) {
        Curso javaColecao = new Curso("Dominando Comeleções do Java", "Paulo Henrique");

        javaColecao.adiciona(new Aula("Trabalhando com Arrays", 21));
        javaColecao.adiciona(new Aula("Trabalhando com Collections", 20));
        javaColecao.adiciona(new Aula("Trabalhando com Lists", 10));

        Aluno a1 = new Aluno("Rodrigo Silveira", 34762);
        Aluno a2 = new Aluno("Guilherme Carlos", 567234);
        Aluno a3 = new Aluno("João Batista", 345245);

        javaColecao.matricula(a1);
        javaColecao.matricula(a2);
        javaColecao.matricula(a3);

        System.out.printf("Todos os alunos Matriculados: \n");
        javaColecao.getAlunos().forEach(a -> {
            System.out.println(a);
        });



    }
}
