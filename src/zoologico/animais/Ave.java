package zoologico.animais;

public class Ave extends Animal{
    private String tipoPenas;

    public Ave(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("piu piu");
    }

}
