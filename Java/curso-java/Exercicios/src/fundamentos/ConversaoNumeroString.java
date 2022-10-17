package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num1 = 10000;										//definição de variavel wrapped
		System.out.println(num1.toString().length());				//exibição do tamanho da string
		
		
		int num2 = 100000;											//definição padrão de variavel int
		System.out.println(Integer.toString(num2).length());		//mudança explicita via wrap para uso do length
		

		System.out.println(""+num1);								//Modo XtoGo de transformar variavel primitiva em String

		System.out.println(""+num2);								//Modo XtoGo de transformar variavel primitiva em String
		
		
	}

}
