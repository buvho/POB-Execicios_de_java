package ExerciciosHerança2.ex1.model;

public class Estagiario extends Funcionario {
    public Estagiario(String Nome, int salario){
        super(Nome, salario);
    }
    @Override
        public double calcularSalario(){
        return salarioBase * 1.05;
    }
}
