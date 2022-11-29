package OO.Composicao.Desafio;
// 1 para N com compras

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    final String name;
    Compra pedido;
    double total;
   
    
    List <Compra> compras = new ArrayList<>();

    Cliente(String name){
        this.name = name;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

//obterValorTotal

    double valorTotal( ){
        for (Compra soma: compras) {
            total += soma.obterValorTotal() ;
        }
        return total;

    }



}
