package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		
		String valor = JOptionPane.showInputDialog("Digite um número: ");
		//>>> bloco com IFs Duplos
		
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Número Par");
					}
		if (numero % 2 == 1) {
			System.out.println("Número Ímpar");
			
		}
		System.out.println("O número digitado foi: "+ numero);
		
		
		
		
		
		//>>>> Bloco com IF/ELSE!
		if (numero % 2 == 0 ) {
			System.out.println("Número Par");
		}else {
			System.out.println("Número Ímpar");
		}
		System.out.println("O número digitado foi: "+ numero);
	}

}
