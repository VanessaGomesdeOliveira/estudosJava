package exemplos.exemplo03;

public class AppPessoa {

    public static void main(String[] args) {
        // cria um novo objeto Pessoa = instanciar
        Pessoa p = new Pessoa ("Vanessa", 33);
        // p.nome = "Vanessa";
        //p.idade = 33;
        p.apresentar();

        Pessoa a = new Pessoa ("Emerson",30);
        // a.nome = "Emerson"; //CTRK + ;
        // a.idade = 30;
        a.apresentar();
    }
    
    

    
    
}
