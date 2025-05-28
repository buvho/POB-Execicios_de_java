package ExerciciosHerança.ex1.model;

public class Aluno extends Pessoa {
    String curso;
    public Aluno(String Nome, int idade, String curso){
        super(Nome, idade);
        this.curso = curso;
    }
    @Override
    public void ExibirDados(){
        System.out.println(nome + ", " + idade + " anos, curso:" + curso);
    }
}
