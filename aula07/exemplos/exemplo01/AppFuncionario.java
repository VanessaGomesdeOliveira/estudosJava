package exemplos.exemplo01;

public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 1000);
        Gerente gerente = new Gerente("Ricardo", 2000, 5);

        //funcionario.nome = "Carlos"; tem que tirar, pois ficou como atributo privado no Funcionario.java
        //gerente.nome = "Renato";

        System.out.println(funcionario.exibirDados());
        System.out.println(gerente.exibirDados());

        funcionario.aumentarSalario(10);
        gerente.aumentarSalario(10);

        System.out.println("Novos Salarios (aumento 10%");
        System.out.println(funcionario.exibirDados());
        System.out.println(gerente.exibirDados());


        //alt + set = mover linha
        //alt + shift + set = copiar linha 
        //ctrl + f5 = executar = tem que estar na janela do main
    }
}
