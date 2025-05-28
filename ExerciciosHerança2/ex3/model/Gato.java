package ExerciciosHerança2.ex3.model;

public class Gato extends animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miando...");
    }
        
}

