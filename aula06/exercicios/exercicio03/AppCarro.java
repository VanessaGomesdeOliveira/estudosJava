package exercicios.exercicio03;

public class AppCarro {
    public static void main(String[] args) {
        // Carro c = new Carro();
        // c.modelo = "Sandero";
        // c.marca = "Renault";
        // c.consumo = 12.5;
        // c.exibir();

        Carro c = new Carro("Sandero", "Renault", 12.5);
        c.exibir();

        c.setConsumo(-10);

        double consumo = c.getConsumo();
        System.out.println("Consumo: " + consumo);

    }
}
