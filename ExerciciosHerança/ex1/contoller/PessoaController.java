package ExerciciosHerança.ex1.contoller;

import ExerciciosHerança.ex1.model.*;

public class PessoaController {
    public static void main(String[] args ){
        Aluno aluno = new Aluno("Pedro", 19, "Engenharia");
        Professor professor = new Professor("Julio", 49, 8900.50);
        aluno.ExibirDados();
        professor.ExibirDados();
    }
}
