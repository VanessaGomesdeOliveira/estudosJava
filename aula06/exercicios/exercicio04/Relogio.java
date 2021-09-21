package exercicios.exercicio04;

public class Relogio {
    //atributos
    private int hora, minuto, segundo;

    //método construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }
    }

    public void getHora() {
        return hora;
    }

    void exibirHora() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && hora < 60) {
            this.minuto = minuto;
        }
    }

    public void getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) 
    if (minuto >= 0 && hora < 60) 
        this.minuto = minuto;
    }
}
public void getMinuto() {
    return minuto;
}

}
