package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vanessa", "(11) 97777-7777");
        Estudante p2 = new Estudante("Guilherme", "(11) 96666-6666", "Analise de Sistema");
        Professor p3 = new Professor("Emerson", "(11) 98888-8888", 10000.50);

        System.out.println(p1.exibirPessoa());
        System.out.println(p1);

        System.out.println(p2);

        System.out.println(p3);
    }
    
}
