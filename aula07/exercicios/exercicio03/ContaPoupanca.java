package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxa; // statis = atributo da calsse, não de cada objeto

    public ContaPoupanca(int numConta, double saldo) {
        super(numConta, saldo);
    }

    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        if (taxa >= 0 && taxa < 1) {
            ContaPoupanca.taxa = taxa;
        }
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor + taxa) {
            return super.saque(valor + taxa);
        }
        return false;
    }
}
