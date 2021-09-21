package exercicios.exercicio03;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {

        /* ESSES FORAM FEITOS APENAS PARA TESTARMOS AS CONTAS
        //Conta c1 = new Conta(152, 100); // não pode criar mais objetos dessa classe, pois ela é abstrata
        //ContaCorrente contaCorrente  = new ContaCorrente(152, 100);
        //ContaEspecial contaEspecial = new ContaEspecial(152, 100, 100);
        ContaPoupanca contaPoupanca = new ContaPoupanca(152, 100);

        contaPoupanca.deposito(100);
        System.out.println(contaPoupanca);
        ContaPoupanca.setTaxa(0.1);
        if (contaPoupanca.saque(300)) {
           System.out.println("Saque realizado"); 
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
        System.out.println(contaPoupanca);
        */

        Scanner entrada = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double saldo, valor;
        ContaCorrente cc = null; // null = nulo = sem referencia a um objeto (aponta para nada)
        ContaEspecial ce = null;
        ContaPoupanca cp = null;

        do { // faça isso
        System.out.println("1 - Nova Conta Corrente");
        System.out.println("2 - Nova Conta Especial");
        System.out.println("3 - Nova Conta Poupança");
        System.out.println("4 - Depósito");
        System.out.println("5 - Saque");
        System.out.println("6 - Consultar saldo");
        System.out.println("7 - Sair");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o número da Conta:");
                numeroConta = entrada.nextInt();
                System.out.println("Digite o saldo da Conta:");
                saldo = entrada.nextDouble();
                cc = new ContaCorrente(numeroConta, saldo);
                break;
            case 2:
                System.out.println("Criando uma nova conta especial");
                break;
            case 3:
                System.out.println("Criando uma nova conta poupança");
                break;
            case 4:
                System.out.println("Qual o valor do deposito");
                valor = entrada.nextDouble();
                cc.deposito(valor);
                break;
            case 5:
                System.out.println("Qual o valor do saque?");
                valor = entrada.nextDouble();
                cc.saque(valor);
                break;
            case 6:
                System.out.println(cc);
                break;
            case 7:
                System.out.println("");
                break;
            default: // se não nenhuma das opções
                System.out.println("Opção inválida");
                break;
        }

        } while (opcao != 7); // enquanto o usuario não digitar o 7


        entrada.close();
    }
}
