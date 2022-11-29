package OO.Composicao.Desafio;
//1 pra N com itens

import java.util.ArrayList;
import java.util.List;

public class Compra {
    
    double parcial;
    Item item;
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p , int qtde){
        this.itens.add(new Item(qtde, p));
    }

    void adicionarItem(String nome, double preco, int qtde){
        this.itens.add(new Item(qtde, new Produto(nome, preco)));
    }

    double obterValorTotal(){
        for(Item item : itens){
            parcial += item.quantidade * item.produto.price;
        }
        return parcial;   
}
}
