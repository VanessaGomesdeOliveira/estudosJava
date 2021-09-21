package exercicios.exercicio03;

public class ContaCorrente extends Conta {
    // final = constante, não pode mudar o valor
    final static double TAXA_DESCONTO = 0.1;
    
    public ContaCorrente(int numConta, double saldo) {
        super(numConta, saldo);
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor) {
            return super.saque(valor);
        }
        return false; // não tem saldo
    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DESCONTO);
    }
}
