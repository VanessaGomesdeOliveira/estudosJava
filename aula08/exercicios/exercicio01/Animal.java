package exercicios.exercicio01;

public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal (String nome, String raca, int anoNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nome, telefone);
    }

    @Override
    public String toString() {
        return nome + " - "  + raca + " - " + anoNascimento + " - " + proprietario.toString();
    }
}

//03:06 parei aqui