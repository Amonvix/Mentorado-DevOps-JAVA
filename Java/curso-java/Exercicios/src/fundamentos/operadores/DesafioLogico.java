package fundamentos.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		//terça  V || F
		//quinta V || F
		
		boolean ter = false;
		boolean qui = false;
		
		
		if (ter&&qui)  {
			System.out.println("A TV comprada foi da de 50° e todos tomaram sorvete");
		}
		if (ter^qui) {
			System.out.println("Compramos a TV de 32° e tomamos o sorvete mais barato");
		}
		if (qui == false && ter == false) {
			System.out.println("não pudemos comprar nem a TV, nem o sorvete");
		}
		 
		
	}

}
