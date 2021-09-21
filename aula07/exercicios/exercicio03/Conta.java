package exercicios.exercicio03;

// abstract =  a classe é um modelo para outras classes
// não posso criar objetos de uma classe abstrata
public abstract class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
        //saldo = saldo + valor;
            saldo += valor; // mesma forma abreviada
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numConta + " : " + saldo;
    }
}
