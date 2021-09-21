package exemplos.exemplo01;


// extends => Gerente "È um" Funcionário - Herança
public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario); // chama o construtor da superclasse: Funcionario
        //this = mesma classe.
        //Super = pertence ao classe pai ou super classe.
        //Herança só puxa dados do classe pai ou super classe.
        this.numFuncionarios = numFuncionarios;
    }

    @Override // este método é uma sobrescrita do original na classe base
    public String exibirDados() {
        return getNome() + " : " + getSalario() + " : " + numFuncionarios;
    }

    // Gerente tem um aumento de 20% a mais dos outros funcionários
    @Override
    public void aumentarSalario(double porcentagem) {
        super.aumentarSalario(porcentagem + 20);
    }

}
