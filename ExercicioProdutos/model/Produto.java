package ExercicioProdutos.model;

public class Produto {
    int id;
    String nome;
    int qtd;
    public Produto(int id,String nome,int qtd){
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getQtd() {
        return qtd;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}

