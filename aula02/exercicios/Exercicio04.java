import java.util.Scanner;

//Sabe-se que um quilowatt de energia custa 1/500 avos do salário minimo.
//Faça um programa que receba o valor do salário minimo e a quantidade de quilowatts consumida por uma residencia, e então exiba:
//O valor, em reais, de cada quilowatt;
//O valor, em reais, a ser pago por essa residência;
//O valor, em reais, a ser pago com desconto de 15%.

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salarioMinimo, quilowatt, consumoQuilowatt, totalQuilowatt, descontoTotalQuilowatt;

        System.out.println("Digite o salário minimo atual:");
        salarioMinimo = entrada.nextDouble();

        quilowatt = salarioMinimo/500;

        System.out.println("Digite o consumo de quilowatt:");
        consumoQuilowatt = entrada.nextDouble();

        totalQuilowatt = consumoQuilowatt * quilowatt;
        System.out.println("Você gastou em quilowatt R$" + totalQuilowatt);

        descontoTotalQuilowatt = totalQuilowatt * 0.85;
        System.out.println("Seu novo valor com desconto de 15% será R$" + descontoTotalQuilowatt);

        entrada.close();
    }
}
