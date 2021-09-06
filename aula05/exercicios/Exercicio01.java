import java.util.Scanner;

//Escreva um programa que leia 10 números inteiros e exiba o MAIOR número digitado.

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, cont, maiorNumero;

        numero = 0;
        cont = 1;
        maiorNumero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número inteiro:", cont++);
            numero = entrada.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado foi " + maiorNumero);


        entrada.close();
    }
}
