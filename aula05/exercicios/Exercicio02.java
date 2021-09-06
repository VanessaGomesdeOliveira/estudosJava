import java.util.Scanner;

//Um professor leciona em 05 turmas diferentes, e cada turma possui 20 alunos.
//Escreva um programa que leia a média de cada aluno de cada uma das turmas, e exiba a média das notas por turma, e a média geral das turmas.
//Dica: Teste com um número de alunos e turmas menor.



public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int QTDE_ALUNOS = 3; // constante
        final int QTDE_TURMAS = 2; // constante

        mediaGeral = 0;
        for (int turma = 1; turma <= QTDE_TURMAS; turma++) {           
            System.out.println();
        }

        mediaTurma = 0;
        for (int aluno = 1; aluno <= QTDE_ALUNOS; aluno++) {
            System.out.printf("Digite a média do %d aluno ", aluno);
            mediaAluno = entrada.nextDouble();
            mediaTurma = mediaTurma + mediaAluno; // mediaTurma += mediaAluno;
        }

        mediaTurma = mediaTurma / QTDE_ALUNOS; // mediaTurma /=3;
        //mediaGeral = mediaGeral + mediaAluno;
        System.out.println("Média da turma: " + mediaTurma);




        entrada.close();
    }
}
