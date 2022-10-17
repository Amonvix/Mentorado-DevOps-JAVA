package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Que dia da semana é hoje? ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("Primeiro dia da semana - 01");
			
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Segundo dia da semana - 02");
		}else if (dia.equalsIgnoreCase("terça")) {			
		System.out.println("Terceiro dia da semana - 03");
		}else if (dia.equalsIgnoreCase("quarta")) {
		System.out.println("Quarto dia da semana - 04");
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Quinto dia da semana - 05");
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Sexto dia da semana - 06");
		}else if (dia.equalsIgnoreCase("sábado")) {
			System.out.println("Sétimo dia da semana - 07");
		}
		else {
			System.out.println("Favor digitar um dia válido");
		}
		System.out.println(dia);
		
		
		
		
		entrada.close();
	}
	

}
