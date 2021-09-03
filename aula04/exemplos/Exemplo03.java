package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        //printf(Formatação, dados) == print formatado
        //formatação = como exibir
        //dados = o que exibir

        //caracter de controle:
        // %d = int
        // %s = String
        // %f = números com decimal (double ou float)
        // %.2f = números com 2 casas decimais
        // %2f = números de digitos na parte inteira
        // \n = pula linha

        System.out.printf("Sua idade é %d\n", 23);
        System.out.printf("Sua idade é %d e seu telefone é %s\n" ,23 , "11-9870707070");
        System.out.printf("Idade: %d altura: %.2f peso: %.2f\n ", 23, 1.75, 80.12345);
    }
}
