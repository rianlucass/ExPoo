package zoologico.funcionario;

import zoologico.animais.Animal;

public class Funcionario {
    private int id;
    private String nome;
    private String especialidade;

    public Funcionario(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void cuidarAnimal(Animal animal) {
        System.out.println("O funcionario está cuidando do animal " + animal.getNome());
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
