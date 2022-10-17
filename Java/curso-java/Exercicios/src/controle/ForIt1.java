package controle;

public class ForIt1 {
	
	public static void main(String[] args) {
		
//		int contador = 0;						//definada variavel a ser incrementada
//		
//		while (contador <= 10) {				//inserida a condição do WHILE. Ira se repetir enquanto for True
//			System.out.println(contador);
//			contador++;	
//			
//		}
	
		for(int contador = 200 ; contador >= 10 ; contador -=5)	//condicional com inicio e fim definidos (variavel contador : condição : incremento)
		
		System.out.println("contagem de for it = " + contador);	//bloco a ser executado em cada um das vezes em que o incremento não mudar a condição pra False
		
		 
		
		//Laço infinito
		
		for(;;)							// Sem a existencia de algo que mude a condição para false, o bloco ira se repetir pra sempre 
		{			
			System.out.println("loop");
			
		}
		
	}
	
}
			
		



