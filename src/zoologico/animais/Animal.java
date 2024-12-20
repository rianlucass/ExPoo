package zoologico.animais;

public abstract class Animal {
    private int id;
    private String nome;
    private String especie;
    private static int totalAnimais;

    public void emitirSom(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static int getTotalAnimais() {
        return totalAnimais;
    }

    public static void setTotalAnimais(int totalAnimais) {
        Animal.totalAnimais = totalAnimais;
    }
}
