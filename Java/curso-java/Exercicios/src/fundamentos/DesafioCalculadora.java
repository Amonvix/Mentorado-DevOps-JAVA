package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double num1 = entrada.nextDouble();		
		
		System.out.print("Digite o segundo valor: ");
		double num2 = entrada.nextDouble();		
		
		System.out.print("Qual operação matematica vamos calcular? ('+', '-', '/', '*') ");
		String simb = entrada.next();
		
		// logica

		double res = "+".equals(simb) ? (num1 + num2) : 0;
		 res = "-".equals(simb) ? (num1 - num2) : res;
		 res = "*".equals(simb) ? (num1 * num2) : res;
		 res = "/".equals(simb) ? (num1 / num2) : res;
		 res = "%".equals(simb) ? (num1 % num2) : res;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, simb, num2, res);
	
					
		entrada.close();
		
	}

}
