package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numConta, double saldo, double limite) {
        super(numConta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.saque(valor); 
        }
        return false;
    }
}
