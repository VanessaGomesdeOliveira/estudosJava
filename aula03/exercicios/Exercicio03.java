package exercicios;

import java.util.Scanner;

//Ler dois números (ponto flutuante) e apresentá-los em ordem não crescente.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();

        if (numero1 > numero2) {
            System.out.println(numero1 + " , " + numero2);
        } else {
            System.out.println(numero2 + " , " + numero1);
        }     

        entrada.close();
    }
}
