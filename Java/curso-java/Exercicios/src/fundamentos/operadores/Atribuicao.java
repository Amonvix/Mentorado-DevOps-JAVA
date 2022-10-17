package fundamentos.operadores;

public class Atribuicao {
	
	
	
	
	public static void main(String[] args) {
		
		int a = 3;					//atribuição literal
		int b = a;					//atribuição do valor da variavel à outra variavel
		int c = a+b;				//atribuição do resultado do calculo à variavel
		
		c += b;			//c = c + b;
		c -= a;			//c = c - a;			
		c *= b;			//c = c * b;
		c /= a;			//c = c / a;
		
		
		System.out.println(c);
		
		c %= 2;		//c = c % 2; 0 ou 1 ... comando usado para verificar par ou impar
		System.out.println(c);
		
		
	}

}
