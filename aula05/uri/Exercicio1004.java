// Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
// A seguir mostre a variável PROD com mensagem correspondente.   

import java.util.Scanner;

public class Exercicio1004 {    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int a, b;

        a = entrada.nextInt();
        b = entrada.nextInt();

        System.out.println("PROD = " + (a * b));

        entrada.close();
    }
}
