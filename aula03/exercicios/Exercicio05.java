package exercicios;

//Faça um programa que verifique a validade de uma senha fornecida pelo usuário.
//Sabendo que a senha é "R10p5", exbir a mensagem "acesso concedido" ou "acesso negado".

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String senha;
        //boolean aceita;

        System.out.println("Digite a senha: ");
        senha = entrada.nextLine();

        //aceita = senha.equals("R10p5");

        //if (aceita == true) {
        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
