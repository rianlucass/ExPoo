package zoologico.animais;

public class Mamifero extends Animal{
    private double tempoGestacao;

    public Mamifero(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("auuaua");
    }

    public double getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(double tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
}
