package ExerciciosHerança2.ex2.model;

public class Veiculo {
    String marca;
    int ano;
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    public void ExibirDados(){
        System.out.println(marca + ", " + ano);
    }
}

