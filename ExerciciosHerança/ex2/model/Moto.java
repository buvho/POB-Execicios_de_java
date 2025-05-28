package ExerciciosHerança.ex2.model;

public class Moto extends Veiculo {
boolean temPartidaEletrica;
    public Moto(String marca, int ano, boolean temPartidaEletrica){
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }
    @Override
    public void ExibirDados(){
          System.out.println(marca + ", " + ano + ", tem partida eletrica?: " + temPartidaEletrica);
    }
}
