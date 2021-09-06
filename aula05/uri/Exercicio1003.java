//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA.
//A seguir escrever o valor desta variável.

import java.util.Scanner;

public class Exercicio1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a, b;

        a = entrada.nextInt();
        b = entrada.nextInt();

        System.out.println("SOMA = " + (a + b));

        entrada.close();
    }
}
