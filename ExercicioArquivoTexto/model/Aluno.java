package model;

public class Aluno{
    private String nome;
    private int matricula;
    private double coeficienteRendimento;
    public Aluno(int matricula, String nome,  double coeficienteRendimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.coeficienteRendimento = coeficienteRendimento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getCoeficienteRendimento() {
        return coeficienteRendimento;
    }
    public void setCoeficienteRendimento(double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }
        public void listarAluno() {
        System.out.println("Matricula: " + matricula + ", Nome: " + nome + ", CR " + coeficienteRendimento);
    }
}
