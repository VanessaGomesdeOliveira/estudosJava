package exercicios;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro N e exiba a sequência:
//1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 ...enquanto o valor for menor ou igual a N.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System. in);
        int n, cont;

        System.out.println("Digite um número inteiro");
        n = entrada.nextInt();
        cont = 1;

        while (cont <= n) {
            System.out.print(cont);
            if (cont <= n / 2) {
                System.out.print(", ");
            }
            cont *= 2;
        }

        entrada.close();
    }
}
