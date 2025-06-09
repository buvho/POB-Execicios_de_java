package exercicioCarro;

public class Caminhao extends Veiculo{
    private int capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, int capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
    super.exibirDados();
    System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
}

}
