package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 5;

        System.out.println( (a < 11) && (b > 0)); // T e T = T
        System.out.println( (a > 11) && (b > 0)); // F e T = F
        System.out.println( (a < 11) || (b > 0)); // T ou T = T
        System.out.println( (a > 11) || (b > 0)); // F ou T = T
    }
}
