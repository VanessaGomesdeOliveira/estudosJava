import java.util.Scanner;

//Escreva um programa que leia os nomes de 7 pessoas e armazene em um vetor.
//A seguir, mostre os nomes em ordem inversa aos que foram digitados.
//Exemplo: Marcos Joao ...Samanta Felipe
//Exibido: Felipe Samanta ...Joao Marcos

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++) { 
            System.out.printf("Digite o %d° nome: ", i + 1);
            nomes[i] = entrada.nextLine();
        }

        for (int i =  nomes.length - 1; i >= 0 ; i--) {
            System.out.print(nomes[i] + " ");
        }

        entrada.close();
    }
}
