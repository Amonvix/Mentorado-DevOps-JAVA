package OO.Composicao;

// Relação direcional 1 x N

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Amon";
        compra1.items.add(new Item("caneta", 1, 3.00));
        compra1.items.add(new Item("caderno", 2, 13.50));
        compra1.items.add(new Item("apagador", 1, 20.99));

        System.out.println(compra1.items.size());
        System.out.println(compra1.obtervalorTotal());

    
}

    
}
