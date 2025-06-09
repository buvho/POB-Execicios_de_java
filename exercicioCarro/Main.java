package exercicioCarro;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar novo veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            System.out.print(">> ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(veiculos, scanner);
                    break;
                case 2:
                    listarVeiculos(veiculos);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarVeiculo(ArrayList<Veiculo> veiculos, Scanner scanner) {
        System.out.println("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Quantidade de Portas: ");
                int qtdPortas = scanner.nextInt();
                veiculos.add(new Carro(placa, modelo, ano, qtdPortas));
                break;
            case 2:
                System.out.print("Cilindrada (cc): ");
                int cilindrada = scanner.nextInt();
                veiculos.add(new Moto(placa, modelo, ano, cilindrada));
                break;
            case 3:
                System.out.print("Capacidade de Carga (toneladas): ");
                int capacidadeCarga = scanner.nextInt();
                veiculos.add(new Caminhao(placa, modelo, ano, capacidadeCarga));
                break;
            default:
                System.out.println("Tipo inválido!");
        }
    }

    private static void listarVeiculos(ArrayList<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado!");
            return;
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                System.out.print("Carro - ");
            } else if (veiculo instanceof Moto) {
                System.out.print("Moto - ");
            } else if (veiculo instanceof Caminhao) {
                System.out.print("Caminhão - ");
            }
            veiculo.exibirDados();
            System.out.println("-------------------");
        }
    }
}