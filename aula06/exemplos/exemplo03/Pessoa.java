package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    int idade; // já começa com zero, ele inicializa (atributo)

    // método construtor = inicializar o objeto
    Pessoa(String s, int i) {
        nome = s;
        idade = i;
    }

    // métodos
    void apresentar(){
        System.out.println("Ola! Eu sou " + nome);
        System.out.printf("Tenho %d anos.\n", idade);
    }
}
