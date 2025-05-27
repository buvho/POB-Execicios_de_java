package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoublePredicate;

import model.Aluno;

public class ControlaAluno {
    private ArrayList<Aluno> alunos;
    private final String arquivo = "alunos.txt";

    public ControlaAluno(){
        this.alunos = new ArrayList<>();
        carregarAlunos();
    }

    public void adicionarAluno(int matricula, String nome, double CoeficienteRendimento) {
        Aluno aluno = new Aluno(matricula, nome, CoeficienteRendimento);
        alunos.add(aluno);
        salvarAlunos();
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                aluno.listarAluno();
            }
        }
    }

     public void alterarAluno(int Matricula) {
        Aluno aluno = buscarAlunoPorMatricula(Matricula);
        if (aluno != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo nome do aluno: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo CR do aluno: ");
            double novoCR = scanner.nextDouble();
            scanner.close();
            
            aluno.setNome(novoNome);
            aluno.setCoeficienteRendimento(novoCR);
            salvarAlunos();
            System.out.println("Aluno alterado com sucesso!");
        } else {
            System.out.println("Aluno com matricula " + Matricula + " não encontrado.");
        }
    }

        public void excluirAluno(int Matricula) {
        Aluno aluno = buscarAlunoPorMatricula(Matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno com Matricula " + Matricula + " não encontrado.");
        }
    }

        private Aluno buscarAlunoPorMatricula(int Matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == Matricula) {
                return aluno;
            }
        }
        return null;
    }

    public void salvarAlunos(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))){
            for (Aluno aluno : alunos){
                writer.write(aluno.getNome() + ";" + aluno.getMatricula() + ";" + aluno.getCoeficienteRendimento());
                writer.newLine();
            }
        }
        catch(Exception e){
            System.out.println("erro: " + e);
        }
    }

    public void carregarAlunos(){
         try(BufferedReader reader = new BufferedReader(new FileReader(arquivo))){
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                int matricula = Integer.parseInt(dados[1]);
                double CR = Double.parseDouble(dados[2]);

            }
        }
        catch(Exception e){
            System.out.println("erro: " + e);
        }
    }
     public static void main(String[] args) {
        ControlaAluno controle = new ControlaAluno();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Matricula do Aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("CR do Aluno: ");
                    double CR = scanner.nextDouble();
                    controle.adicionarAluno(matricula, nome, CR);
                    break;
                case 2:
                    controle.listarAlunos();
                    break;
                case 3:
                    System.out.print("Matricula do Aluno a alterar: ");
                    int matriculaAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarAluno(matriculaAlterar);
                    break;
                case 4:
                    System.out.print("Matricula do Aluno a excluir: ");
                    int matriculaExcluir = scanner.nextInt();
                    controle.excluirAluno(matriculaExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}