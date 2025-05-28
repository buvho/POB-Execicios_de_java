package ExerciciosHerança2.ex1.model;

public class Gerente extends Funcionario {
    public Gerente (String Nome, int salario){
        super(Nome, salario);
    }
    @Override
        public double calcularSalario(){
        return salarioBase * 1.30;
    }
}
