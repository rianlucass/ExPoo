import zoologico.animais.Mamifero;
import zoologico.funcionario.Funcionario;
import zoologico.gerenciamento.Zoologico;

public class TesteZoologico {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        Funcionario funcionario = new Funcionario(1, "jose", "Cuidador de mamiferos");
        Mamifero animal = new Mamifero();
        animal.setNome("gato");
        animal.setEspecie("mamifero");
        animal.setId(1);
        animal.setTempoGestacao(1);

        zoologico.adicionarFuncionario(funcionario);
        zoologico.adicionarAnimal(animal);
        zoologico.cuidarAnimal(animal);
    }
}
