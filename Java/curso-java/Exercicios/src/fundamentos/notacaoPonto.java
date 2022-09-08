package fundamentos;

public class notacaoPonto 
{
	
	public static void main(String[] args) 
	{
		
		String s = "Bom dia X"; // Definida variavel nao primitiva 
		
		s = s.concat("!!!"); // comando concat para concatenar o valor tipo string no final do conteudo
		
		s = s.replace("X", "Senhora"); // Comando replace para trocar o valor do primeiro campo pelo do segundo
		s = s.toUpperCase(); // Comando usando para alternar para caixa alta, mesmo serve para toLowerCase
//		s = s.toLowerCase();		
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		
		System.out.println(x);
		
		// o operador pode ser usado quebrando-se a linha antes ou depois do ponto.
		String y = "Bom dia, X"
				.replace("X", "Dani")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem operador "."
		
		int a = 4;
		System.out.println(a);
	}

}
