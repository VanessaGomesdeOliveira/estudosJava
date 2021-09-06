//Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
//Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

import java.util.Scanner;

public class Exercicio1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero, numeroPositivo, numeroNegativo, soma, media;

        numeroPositivo = 0;
        numeroNegativo = 0;
        soma = 0;
        numero = 0;

        for (int i = 1; i <=6 ; i++) {
            numero = entrada.nextDouble();
            if (numero >= 0) {
                numeroPositivo = numeroPositivo + 1;
                soma = soma + numero;
            } else {
                numeroNegativo = numeroNegativo + 1;
            }
        }

        media = soma/numeroPositivo;

        System.out.printf("%.0f valores positivos\n", numeroPositivo);

        System.out.printf("%.1f\n", media);
        
        entrada.close();
    }
}
