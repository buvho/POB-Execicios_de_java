package ExerciciosHerança2.ex3.model;

public class animal {
    String nome;
    int idade;
    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void emitirSom(){
        System.out.println("Som Genérico de animal");
    }
    public void ExibirDados(){
        System.out.println(nome + ", " + idade + " anos");
    }
}

