package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, somaPar, somaImpar, cont;
        cont = 1;
        somaPar = 0;
        somaImpar = 0;
        numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° numero ", cont++);
            numero = entrada.nextInt();
            if (numero % 2 == 0) {           
                somaPar = somaPar + numero;
            } else {
                somaImpar = somaImpar + numero;
            }           
        }
        System.out.println("Soma dos números impares será " + somaImpar);
        System.out.println("Soma dos números pares será " + somaPar);

        entrada.close();
    }
}
