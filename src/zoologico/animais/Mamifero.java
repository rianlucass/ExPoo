package zoologico.animais;

public class Mamifero extends Animal{
    private double tempoGestacao;

    @Override
    public void emitirSom() {

    }

    public double getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(double tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
