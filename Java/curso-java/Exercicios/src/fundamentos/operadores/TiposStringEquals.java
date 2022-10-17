package fundamentos.operadores;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");				//forma convencional de verificar iqualdade entre strings não muito confiavel quando usado variavel
		
		String s1 = new String("2");				//comparação usando iqualdede que da false mesmo sendo os mesmos valores
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));	 		//Comando equals usado para verificar a iqualdade de valores dentro da string
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());		//Comando .trim usado para remover todos os espaços excessivos
		System.out.println("2".equals(s2.trim()));	//Por ser um objeto, podemos usar a notação ponto
		
		entrada.close();
		
		
		
		
	}
	
}
