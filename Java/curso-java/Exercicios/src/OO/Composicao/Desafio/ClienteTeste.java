package OO.Composicao.Desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marcio");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 3.5, 3);
        compra1.adicionarItem(new Produto("Monitor", 1200),2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 13.5, 2);
        compra2.adicionarItem(new Produto("Notebook", 4200),3);
        
        cliente.adicionarCompra(compra2);
        cliente.adicionarCompra(compra1);

        System.out.println(cliente.valorTotal());
    }
}
