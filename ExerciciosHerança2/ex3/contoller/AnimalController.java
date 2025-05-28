package ExerciciosHerança2.ex3.contoller;

import ExerciciosHerança2.ex3.model.*;

public class AnimalController {
    public static void main(String[] args ){
        Gato gato = new Gato("Aurora", 2);
        Cachorro cachorro = new Cachorro("Amora", 5);
        gato.ExibirDados();
        cachorro.ExibirDados();
        gato.emitirSom();
        cachorro.emitirSom();
    }
}
