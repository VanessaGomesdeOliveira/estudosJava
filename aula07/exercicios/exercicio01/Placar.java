package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int gol1, gol2;

    public Placar (){
        time1 = "Time da casa";
        time2 = "Visitante";
    }

    public Placar (String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
    }

    public Placar (String time1, String time2, int gol1, int gol2){
        this.time1 = time1;
        this.time2 = time2;
        this.gol1 = gol1;
        this.gol2 = gol2;
    }

    public String exibirPlacar() {
        return time1 + " " + gol1 + " x " + gol2 + " " + time2;
    }

}
