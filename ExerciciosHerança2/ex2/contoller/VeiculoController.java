package ExerciciosHerança2.ex2.contoller;

import ExerciciosHerança2.ex2.model.*;

public class VeiculoController {
    public static void main(String[] args ){
        Carro carro = new Carro("Ford", 2022, 4);
        Moto moto = new Moto("Yamaha", 2019, 80);
        carro.ExibirDados();
        moto.ExibirDados();
    }
}
