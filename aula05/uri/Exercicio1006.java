// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
// Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a, b, c, media;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        media = (a * 0.2) + (b * 0.3) + (c * 0.5);
        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();
    }
}
