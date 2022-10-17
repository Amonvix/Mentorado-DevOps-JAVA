package controle.EstruturasDeControle;

import java.util.Scanner;

public class ExercicioFinal02 {

	
	//2. Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		int ano = 0;
		System.out.print("Informe o ano que vamos calcular = ");
		ano = entrada.nextInt();
		
		//Logica
		
		//Divisível por 4
		//Não pode ser divisível por 100
		//Divisão por 400 tem que ser sem resto
		
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
			System.out.printf("%d é/foi um ano BISSEXTO",ano);
		}else
			System.out.printf("%d é/foi um ano REGULAR",ano);
		
		
		
		entrada.close();
		
		
	}
}
