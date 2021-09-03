package exercicios;

import java.util.Scanner;

//Faça um programa que leia um numero inteiro.
//Se o número for maior que 20, caluclar e imprimir a metade dele.

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        if (numero > 20) {
            //System.out.println("A metade do número " + numero + " é " + (numero / 2));
            //casting = conversao de tipos, só temporário
            System.out.println("A metade do número " + numero + " é " + ((double)numero / 2));
        }

        entrada.close();
    }
}
