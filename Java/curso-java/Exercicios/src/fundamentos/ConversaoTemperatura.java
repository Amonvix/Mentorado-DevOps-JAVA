package fundamentos;

public class ConversaoTemperatura {
	
	public static void main(String[] args) {
		
		
		//(F° - 32) * (5/9) = C°		>>>Calculo usado para conversão de temperaturas
		
		double fahrenheit = 100;		//atribuição de valor à variavel
		final double diferenca = 32;	//atribuição de valor à constante
		double fator = 5.0/9;			//resultado do calculo armazenado na variavel
		
		double celcius = (fahrenheit - diferenca) * fator;		//resultado do calculo armazenado na variavel
		
		System.out.println("Temperatura = "+celcius+"°C");		//exibição da variavel concatenada
		
		
 	}

}
