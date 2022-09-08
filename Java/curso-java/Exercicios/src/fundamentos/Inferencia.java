package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a); // tipo de variavel inferido pelo Java. Não é possivel mudar o tipo de variavel
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "outro texto";
		System.out.println(c);

		double d; // variavel declarada
		d = 123.65; // variavel inicializada
		System.out.println(d); // variavel utilizada
		
		var e = 12; // variavel inferida como int
		System.out.println(e);
		
		// e = 12.0; -->> impossivel de atribuir o valor a e, pois o mesmo não pode mudar de tipo primitivo.
		
		
		
		

		
		
		
		
	}

}
