package exercicioCarro;


public class Moto extends Veiculo {
    private int cilindrada;
    
    public Moto(String placa, String modelo, int ano, int cilindrada) {
        super(placa, modelo, ano);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public void exibirDados() {
    super.exibirDados();
    System.out.println("Cilindrada: " + cilindrada + "cc");
}
}
