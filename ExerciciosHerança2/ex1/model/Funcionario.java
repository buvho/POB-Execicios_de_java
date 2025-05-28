package ExerciciosHerança2.ex1.model;

public class Funcionario {
    String nome;
    double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public void ExibirDados(){
        System.out.println(nome + ", R$" + salarioBase );
    }
    public double calcularSalario(){
        return salarioBase;
    }
}

