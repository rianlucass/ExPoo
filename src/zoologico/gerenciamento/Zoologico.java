package zoologico.gerenciamento;

import zoologico.animais.Animal;
import zoologico.animais.Mamifero;
import zoologico.funcionario.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;
    private List<Funcionario> funcionarios;

    public Zoologico() {
        this.animais = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
        Animal.setTotalAnimais(animais.size());
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void cuidarAnimal() {
        for (int i = 0; i < funcionarios.size(); i++){
            if (funcionarios.get(i).getEspecialidade().equals("Cuidador de mamiferos")){
                for (int j = 0; j < animais.size(); j++) {
                    if (animais.get(j).getEspecie().equals("Mamifero")){
                        funcionarios.get(i).cuidarAnimal(animais.get(j));
                    }
                }
            } else if (funcionarios.get(i).getEspecialidade().equals("veterinario")) {
                for (int j = 0; j < animais.size(); j++) {
                    if (animais.get(j).getEspecie().equals("reptil")){
                        funcionarios.get(i).cuidarAnimal(animais.get(j));
                    }
                }
            } else {
                for (int j = 0; j < animais.size(); j++) {
                    if (animais.get(j).getEspecie().equals("ave")){
                        funcionarios.get(i).cuidarAnimal(animais.get(j));
                    }
                }
            }
        }
    }

    public void alterarNomeAnimal(Animal animal, String novoNome) {
        animal.setNome(novoNome);
        System.out.println("O nome do animal foi alterado para: " + novoNome);
    }



}
