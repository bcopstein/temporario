public class CadastroProfessor {
    private Professor[] grupo;
    private int index;

    public CadastroProfessor(){
        grupo = new Professor[10];
        index = 0;
    }

    public boolean acrescentaProfessor(Professor novo){
        if (index < 10){
            grupo[index] = novo;
            index++;
            return true;
        }else{
            return false;
        }
    }

    // Acrescentar método para imprimir todos os professores

    // Acrescentar método para retornar o professor com o número de matrícula informado

    // Acrescentar método para somar a carga horária dos professores

    // Acrescentar método para retornar o somatório do salário dos professores

    /*
    Exercícios:
    Crie um método que retorne quantos professores existem cadastrados;
    Crie um método que retorne se um professor está cadastrado, passando pelo parâmetro o String referente ao nome do professor;
    Crie um método que retorne a quantidade de professores que possuem uma carga horária menor do que a informada pelo parâmetro;
    Crie um método que mostre a média salarial dos professores cadastrado;

    Demonstre que os métodos funcionam ativando os mesmos a partir do main
    */
}
