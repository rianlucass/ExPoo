import zoologico.animais.Animal;
import zoologico.animais.Ave;
import zoologico.animais.Mamifero;
import zoologico.animais.Reptil;
import zoologico.funcionario.Funcionario;
import zoologico.gerenciamento.Zoologico;

public class TesteZoologico {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        Funcionario cuidador = new Funcionario(1, "jose", Funcionario.CUIDADOR);
        Funcionario veterinario = new Funcionario(2, "Maria", Funcionario.VETERINARIO);
        Funcionario veterinarioAves = new Funcionario(3, "Mario", Funcionario.VET_AVES);

        Mamifero leao = new Mamifero("leão", "Mamifero");
        Ave papagaio = new Ave("papagaio", "ave");
        Reptil cobra = new Reptil("cobra", "reptil");

        zoologico.adicionarAnimal(leao);
        zoologico.adicionarAnimal(papagaio);
        zoologico.adicionarAnimal(cobra);

        zoologico.adicionarFuncionario(cuidador);
        zoologico.adicionarFuncionario(veterinario);
        zoologico.adicionarFuncionario(veterinarioAves);

        zoologico.cuidarAnimal();

        zoologico.alterarNomeAnimal(leao, "rei leão");
        System.out.println("Total de animais: " + Animal.getTotalAnimais());

    }
}
