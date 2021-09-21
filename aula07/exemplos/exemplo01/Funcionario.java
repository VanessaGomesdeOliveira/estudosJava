package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    //Overload = esse metodo é uma sobrecarga
    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 0;
    } 

    public Funcionario() {
        this.nome = "Sem cadastro";
    }

    public String exibirDados() {
        return nome + " : " + salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void aumentarSalario(double porcentagem) {
        salario = salario + salario * porcentagem/100;
    }
}