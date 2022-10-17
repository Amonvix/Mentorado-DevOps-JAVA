package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		Integer nota = 0;
		System.out.println("Qual a nota a ser verificada? ");
		nota = entrada.nextInt();
		
		while (nota < 0 || nota > 10)
		{ 
			System.out.println("Nota inválida! Tente novamente");
			System.out.println("Qual a nota a ser verificada? ");
			nota = entrada.nextInt();
			
		}
		
		switch ((int) nota) {
		case 10: case 9: {
			conceito = "A";
			break;
		}
		case 8: case 7:{
			conceito = "B";
			break;
		}
		case 6: {
			conceito = "C";
			break;
		}
		case 5: case 4: {
			conceito = "D";
			break;
		}
		case 3: case 2: case 1: case 0: {
			conceito = "E";
			break;
		
		}
		}
		System.out.println("Aluno conceito " + conceito);
		entrada.close();
	}
}
