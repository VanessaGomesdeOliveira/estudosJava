import java.util.Scanner;

//Faça um programa que leia o salário de um funcionário.
//Sabendo que o salário do funcionário teve um aumento de 25%, calcular e mostrar o novo salário.

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario, novoSalario;

        System.out.println("Digite o seu salário atual:");
        salario = entrada.nextDouble();

        novoSalario = salario * 1.25;

        System.out.println("Seu novo salário será " + novoSalario);
        entrada.close();

    }
}
