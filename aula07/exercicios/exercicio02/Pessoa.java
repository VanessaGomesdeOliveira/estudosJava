package exercicios.exercicio02;

public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa (String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String exibirPessoa() { //como escrevi toString não precisa editar os dois
        return nome + " - " + telefone;
    }

    @Override
    public String toString() {
        return nome + " - " + telefone;
    }
}
