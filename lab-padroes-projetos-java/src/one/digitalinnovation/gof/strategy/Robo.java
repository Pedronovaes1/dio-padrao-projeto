package one.digitalinnovation.gof.strategy;

public class Robo {
    //será a estratégia para o robô
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
