package exercicios;

//Peça para o usuário digitar um número inteiro e faça uma tabuada.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tab, valorDigitado;

        System.out.println("Digite um número inteiro: ");
        valorDigitado = entrada.nextInt();

        tab = 0;

        while (tab <= 10) {
            //System.out.println(valorDigitado + " x " + tab + " = " + (valorDigitado*tab));
            System.out.printf("%d x %2d = %2d\n", valorDigitado, tab, (valorDigitado*tab));
            tab++;
        }

        entrada.close();
    }
}
