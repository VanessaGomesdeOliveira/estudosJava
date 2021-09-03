package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String nome;

        nome = "vanessa";

        //equals = faz diferença maiuscula e minuscula
        //equalsIgnoreCase = não faz diferença maiuscula e minuscula

        //if (nome.equals("Vanessa")) {
        if (nome.equalsIgnoreCase("Vanessa")) {
            System.out.println("Olá Vanessa!");
        } else {
            System.out.println("Você não é a Vanessa!");
        }

        System.out.println();
    }
}
