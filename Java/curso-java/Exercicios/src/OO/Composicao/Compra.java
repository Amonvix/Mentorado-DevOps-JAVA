package OO.Composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;


    ArrayList <Item> items = new ArrayList<>();

    double obtervalorTotal(){
        double total = 0;

        for (Item item : items) {
            total += item.quantidade * item.preco;
        }
        return total;
    }


    
}
