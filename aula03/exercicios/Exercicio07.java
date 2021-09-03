package exercicios;

import java.util.Scanner;

//Faça um programa que leia o salário de uma pessoa e exiba o desconto do INSS segundo a tabela:
//<= R$ 600,00 Isento, > R$ 600,00 e <= 1200 20%, > R$ 1200 e <= R$ 2000 25% e > R$ 2000 30%.

public class Exercicio07 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario;

        System.out.println("Digite o salário:");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("INSS será Isento");
        } else if (salario <= 1200) {
            System.out.println("Desconto do INSS será de 20%");
        } else if (salario <= 2000) {
            System.out.println("Desconto do INSS será de 25%");
        } else {
            System.out.println("Desconto do INSS será de 30%");
        }

        entrada.close();
    }
}
