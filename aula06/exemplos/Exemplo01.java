package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        linha();
        System.out.println("Meu programa");
        linha(); //chamada de método
        System.out.println("08/09");
        linha2(5);
        linha2(15);
        linha3(10, '*'); //usar uma aspa apenas
    }

    static void linha() {
        System.out.println("--------");
    }
    
    static void linha2(int tamanho) { //tamanho é um parâmetro
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();     
    }

    static void linha3(int tamanho, char letra) { 
        for (int i = 0; i < tamanho; i++) {
            System.out.print(letra);
        }
        System.out.println();     
    }

}