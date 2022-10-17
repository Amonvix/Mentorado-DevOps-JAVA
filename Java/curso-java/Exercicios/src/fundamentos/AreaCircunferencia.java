package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 100;							//declaração e atribuição de valor a variavel double raio
		final double PI = 3.1416;					//declaração e atribuição de valor a constante double PI
		double area = PI * raio * raio;				//declaração e atribuição de valor a variavel double
		
		System.out.println("Área = " + area);		//Exibição do calculo com concatenação de texto
		
		raio = 15;									//atribuição de novo valor à variavel raio
		area = PI * raio * raio;					//acionamento de calculo com os novos valores
	

		System.out.println("Área = " + area);		//Exibição do calculo com concatenação de texto
		
	}

}
