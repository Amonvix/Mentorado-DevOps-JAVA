package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "verde";
		
		switch (faixa.toLowerCase()) {
		case "preta": {
			
			System.out.println("sei o kata da FAIXA PRETA");
		}
		case "marom": {
			
			System.out.println("sei o kata da FAIXA MAROM");
		}
		case "roxa": {
			
			System.out.println("sei o kata da FAIXA ROXA");
		}
		case "verde": {
			
			System.out.println("sei o kata da FAIXA VERDE");
		}
		case "laranja": {
			
			System.out.println("sei o kata da FAIXA LARANJA");
		}
		case "vermelha": {
			
			System.out.println("sei o kata da FAIXA VERMELHA");
		}
		case "amarela": {
			
			System.out.println("sei o kata da FAIXA AMARELA");
		}
		break;
		default:
			System.out.println("Ainda não sei nada");
		}
			System.out.println("Fim");
			
		//Codigo REALMENTE SEM BREAK
			
			
		int idade = 3;
		
		switch (idade) {
		case 3: {
			System.out.println("Sabe respirar");
		}
		case 2: {
			
			System.out.println("Sabe andar");
		}
		case 1: {
			
			System.out.println("Sabe falar");
		}
		}
		
	}

}
