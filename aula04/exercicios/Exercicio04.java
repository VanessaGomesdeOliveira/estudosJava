package exercicios;

//Escreva um programa que leia vários números inteiros, até que o usuário digite 0 (zero), e exiba a soma dos valores digitados.
//Exemplo: Digite um número: 4, digite outro...digite outro 0 e pára e exibe as somas dos números.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n, soma, cont;

        
        System.out.println("Digite o 1° número inteiro: ");
        n = entrada.nextInt();
        soma = n;
        cont = 2;

        while (n != 0) {
            System.out.printf("Digite o %d° número inteiro (0=fim):", cont++);
            n = entrada.nextInt();
            soma = soma + n;
        }

        System.out.println("A soma dos valores é " + soma);

        entrada.close();
    }
}
