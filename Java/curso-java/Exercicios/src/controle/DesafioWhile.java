package controle;

import java.util.Scanner;

public class DesafioWhile {

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		double nota = 0;
		double tot = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota para calculo: ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				tot = tot + nota;
				cont++;				
			}else if (nota != -1){
				System.out.println("Nota inválida! ");
			}
		//	System.out.println(tot);
		}
		// media
		double media = tot / cont;
		System.out.printf("O total das notas é %.2f \n", tot);
		System.out.printf("A media das notas é %.2f\n", media);
		System.out.printf("Foram digitadas %d notas", cont);
		
		
		
		entrada.close();
	}
}
