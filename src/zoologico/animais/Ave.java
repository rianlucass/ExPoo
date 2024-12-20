package zoologico.animais;

public class Ave extends Animal{
    private String tipoPenas;

    @Override
    public void emitirSom() {
        System.out.println("piu piuu");
    }

}
