package exercicios;

import java.util.Scanner;

//Escreva um programa que recebe os 03 comprimentos de lados a, b e c.
//Determine a seguir o tipo de triangulo formado:
// - Se a>2+c (para cada lado vale o mesmo) não formam triângulo algum.
// - Se forem todos os lados iguais forma um triângulo equilátero.
// - Se a=b ou b=c ou a=c então formam um triângulo isósceles.
// - Caso contrário forma um triângulo escaleno.

public class Exemplo08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("Digite os lados do triângulo: ");
        ladoA = entrada.nextInt();
        ladoB = entrada.nextInt();
        ladoC = entrada.nextInt();

        if (ladoA > (ladoB + ladoC) || ladoB > (ladoA + ladoC) || ladoC > (ladoA + ladoB)) {
            System.out.println("Não formam triângulo algum");
        } else if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Temos um triângulo Equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA ==ladoC) {
            System.out.println("Temos um triângulo Isósceles");
        } else {
            System.out.println("Temos um triângulo Escaleno");
        }

        entrada.close();
    }
}
