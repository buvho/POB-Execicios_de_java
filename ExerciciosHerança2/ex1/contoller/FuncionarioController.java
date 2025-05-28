package ExerciciosHerança2.ex1.contoller;

import ExerciciosHerança2.ex1.model.*;

public class FuncionarioController {
    public static void main(String[] args ){
        Estagiario estagiario = new Estagiario("Pedro", 1900);
        Gerente gerente = new Gerente("Julio", 8000);
        estagiario.ExibirDados();
        gerente.ExibirDados();
        System.out.println("salario final do estagiario: " + estagiario.calcularSalario());
        System.out.println("salario final do gerente: " + gerente.calcularSalario());
    }
}
