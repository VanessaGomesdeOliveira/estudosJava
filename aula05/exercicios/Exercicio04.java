import java.util.Scanner;

//Escreva um programa que leia as notas da prova de 10 anos e armazene em um vetor.
//A seguir, mostre: Todas as notas, a média da turma, a quantidade de notas acima da média da turma. 

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        final int QTDE_NOTAS = 7;
        double [] notas = new double[QTDE_NOTAS];
        double media;
        int acimaMedia;
        media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do %d° aluno ", i+1);
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }

        media /= notas.length;

        acimaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.print("Notas digitadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        
        System.out.printf("\nMédia das notas: %.2f\n", media);
        System.out.println("Notas acima da média: " + acimaMedia);

        entrada.close();
    }
}
