import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System. in);
        double notas[] = new double [5]; // indices : 0, 1, 2, 3, 4

        for (int i = 0; i < notas.length; i++) { // notas.length = tamanho do vetor
            System.out.printf("Digite a %d° nota: ", i+1);
            notas[i] = entrada.nextDouble(); // i = indice do vetor
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota[%d] = %.2f\n", i, notas[i]);
        }

       entrada.close();
    }
}
