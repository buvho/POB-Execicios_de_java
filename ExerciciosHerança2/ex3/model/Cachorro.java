package ExerciciosHerança2.ex3.model;

public class Cachorro extends animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Latido...");
    }
        
}

