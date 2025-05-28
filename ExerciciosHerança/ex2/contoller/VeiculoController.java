package ExerciciosHerança.ex2.contoller;

import ExerciciosHerança.ex2.model.*;

public class VeiculoController {
    public static void main(String[] args ){
        Carro carro = new Carro("Ford", 2022, 4);
        Moto moto = new Moto("Yamaha", 2019, false);
        carro.ExibirDados();
        moto.ExibirDados();
    }
}
