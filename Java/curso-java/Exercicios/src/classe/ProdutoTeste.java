package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		// p1.nome = "caneta";
		p1.preco = 100;
		// Produto.desconto = 0.90;
		
		Produto p2 = new Produto("Monitor",1000);
		// p2.nome = "Monitor";
		// p2.preco = 1000;
		// Produto.desconto = 0.10;		

		System.out.println(p1.preco);
		System.out.println(p2.preco);

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediacarrinho = (precoFinal1 + precoFinal2) / 2 ;

		System.out.printf("\n\n\nMédia do carrinho = R$ %.2f\n\n\n" , mediacarrinho);


		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
	}
	

}
