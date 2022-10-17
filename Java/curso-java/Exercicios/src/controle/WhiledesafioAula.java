package controle;

import java.util.Scanner;

public class WhiledesafioAula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String Sair = "Sair";
		
		System.out.print("digite qualquer coisa... Para encerrar digite        sair      ");
		String dado = entrada.nextLine();
		
		
		while (!dado.equalsIgnoreCase(Sair)) {
			System.out.println("tente novamente");
			System.out.print("digite qualquer coisa... Para encerrar digite     sair      ");
			dado = entrada.nextLine();
				
			}
		System.out.println("Aplicação encerrada!");
		entrada.close();
		}
	}
	

