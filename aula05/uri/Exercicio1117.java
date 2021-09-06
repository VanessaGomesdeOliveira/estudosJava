//Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral.
//Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
// Cada nota deve ser validada separadamente.

import java.util.Scanner;

public class Exercicio1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, media;

        nota1 = entrada.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = entrada.nextDouble();
        }
       
        nota2 = entrada.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = entrada.nextDouble();
        }

        media = (nota1 + nota2)/2;

        System.out.printf("media = %.2f\n" , media);
        entrada.close();
    }
}
