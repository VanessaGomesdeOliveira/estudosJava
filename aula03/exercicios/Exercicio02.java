package exercicios;

//Dadas 2 notas de um aluno (nota1 e nota2), calcular a média, e informar se ele foi aprovado ou reprovado.
//Considere: Nota1 tem peso 40% e Nota2 tem peso 60%.
//O aluno é aprovado quando a média foi >= 6,0.

public class Exercicio02 {
    public static void main(String[] args) {
        double nota1, nota2, mediaAluno;

        nota1 = 5;
        nota2 = 5.5;

        mediaAluno = (nota1 * 0.40) + (nota2 * 0.60);

        System.out.println("Sua nota1 é " + nota1 + " e sua nota2 " + nota2);
       
        if (mediaAluno >= 6.0) {
            System.out.println("Sua média foi " + mediaAluno + " então você foi aprovado");
        } else {
            System.out.println("Sua média foi " + mediaAluno + " então você foi reprovado");
        }
        System.out.println("Fim do programa.");
    }
}
