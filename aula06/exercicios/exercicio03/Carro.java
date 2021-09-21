package exercicios.exercicio03;

public class Carro {
    //atributos
    String modelo, marca;
    double consumo;

    // método construtor = inicializar o objeto
    Carro(String modelo, String marca, double consumo) {
    this.modelo = modelo;
    this.marca = marca;
    setConsumo(consumo);
}

    //metodo
    void exibir(){
        System.out.println("O carro é da marca " + marca + " e do modelo " + modelo);
        System.out.printf("O seu consumo é de %.2f km/l\n", consumo);
    }

    double getConsumo() { //obterConsumo()
        return consumo;
    }
            
    void setConsumo(double consumo) { //alterarConsumo
        if(consumo > 0) {
            this.consumo = consumo;
        }
    }
}
