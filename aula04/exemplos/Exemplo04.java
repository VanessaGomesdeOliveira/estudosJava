package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int cont;

        for (cont = 1; cont < 5; cont++) { //variavel cont é LOCAL ao for
            System.out.println(cont);
        }
        System.out.println("Final: " + cont);
    }
}