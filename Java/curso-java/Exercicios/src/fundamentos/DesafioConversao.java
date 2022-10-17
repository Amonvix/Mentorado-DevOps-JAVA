package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o nome do Colaborador? ");
		String nome = entrada.nextLine();
		
		System.out.printf("Qual foi o ÚLTIMO sálario recebido por %s? ", nome);
		String sal1 = entrada.nextLine().replace(",", ".");
		float sa1 = Float.parseFloat(sal1);
		
		System.out.print("E qual foi o valor do PENÚLTIMO? ");
		String sal2 = entrada.nextLine().replace(",", ".");
		float sa2 = Float.parseFloat(sal2);
		
		System.out.print("Agora informe o anterior a este: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		float sa3 = Float.parseFloat(sal3);
		
		float soma = sa1+sa2+sa3;
		
		entrada.close();

		System.out.printf("%s recebeu nos ultimos 3 meses a soma de R$%.2f, tendo em média um recebimento de R$%.2f.",nome , soma , soma/3);
		
		

	}

}
