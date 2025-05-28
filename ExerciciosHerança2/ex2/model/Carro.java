package ExerciciosHerança2.ex2.model;

public class Carro extends Veiculo {
    int numeroDePortas;
    public Carro(String marca, int ano, int numeroDePortas){
        super(marca, ano);
        this.numeroDePortas = numeroDePortas;
    }
    @Override
        public void ExibirDados(){
        System.out.println(marca + ", " + ano + ", n de portas: " + numeroDePortas);
    }
}

