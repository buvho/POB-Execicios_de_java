package ExercicioProdutos.controller;

import java.util.ArrayList;

import ExercicioProdutos.model.Produto;

public class controller {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void Incluir(int id,String nome,int quant) {
       Produto novoProduto = new Produto(id,nome,quant);
       produtos.add(novoProduto);
    }
    public Produto Consultar(int id) {
        for(Produto p : produtos){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public Produto GetProdutos;
}
