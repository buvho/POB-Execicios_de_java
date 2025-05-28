package ExerciciosHerança.ex1.model;

public class Professor extends Pessoa {
    Double salario;
    public Professor(String Nome, int idade, Double salario){
        super(Nome, idade);
        this.salario = salario;
    }
    @Override
    public void ExibirDados(){
        System.out.println(nome + ", " + idade + " anos, salario:" + salario);
    }
}
