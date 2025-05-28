package ExerciciosHerança.ex1.model;

public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void ExibirDados(){
        System.out.println(nome + ", " + idade + " anos");
    }
}

