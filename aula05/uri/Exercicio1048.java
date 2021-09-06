//A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
//Salário	Percentual de Reajuste
//0 - 400.00 = 15%
//400.01 - 800.00 = 12%
//800.01 - 1200.00 = 10%
//1200.01 - 2000.00 = 7%
//Acima de 2000.00 = 4%
//Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

import java.util.Scanner;

public class Exercicio1048 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario, novoSalario, valorReajuste;

        salario = entrada.nextDouble();

        if (salario <= 400.00) {
            novoSalario = salario*1.15;
            valorReajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novoSalario, valorReajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario <= 800.00) {
            novoSalario = salario*1.12;
            valorReajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novoSalario, valorReajuste);
            System.out.println("Em percentual: 12 %");
        } else if (salario <= 1200.00) {
            novoSalario = salario*1.10;
            valorReajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novoSalario, valorReajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salario <= 2000.00) {
            novoSalario = salario*1.07;
            valorReajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novoSalario, valorReajuste);
            System.out.println("Em percentual: 7 %");
        } else {
            novoSalario = salario*1.04;
            valorReajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\n", novoSalario, valorReajuste);
            System.out.println("Em percentual: 4 %");
        }

        entrada.close();
    }  
}
