package zoologico.animais;

public class Reptil extends Animal{
    private double temperaturaCorporal;

    public Reptil(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("huhuhu");
    }
}
