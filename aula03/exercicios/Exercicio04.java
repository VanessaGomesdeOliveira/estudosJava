package exercicios;

import java.util.Scanner;

//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários.
//Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//Faça um programa que leia o salário bruto e o valor da prestação e informe se o empréstimo pode ou não ser concedido.

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioBruto, prestacaoCredito;

        System.out.println("Digite o salário do funcionário");
        salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação");
        prestacaoCredito = entrada.nextDouble();
        
        if (prestacaoCredito <= (salarioBruto*0.30)) {
            System.out.println("Seu salário é " + salarioBruto + " e sua prestação será de " + prestacaoCredito + " então seu empréstimo poderá ser concedido");
        } else {
            System.out.println("Seu salário é " + salarioBruto + " e sua prestação será de " + prestacaoCredito + " então seu empréstimo não poderá ser concedido");
        }

        entrada.close();
    }
}
