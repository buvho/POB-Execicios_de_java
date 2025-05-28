package ExerciciosHerança2.ex2.model;

public class Moto extends Veiculo {
int cilindradas;
    public Moto(String marca, int ano, int cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;
    }
    @Override
    public void ExibirDados(){
          System.out.println(marca + ", " + ano + ", tem partida eletrica?: " + cilindradas);
    }
}
