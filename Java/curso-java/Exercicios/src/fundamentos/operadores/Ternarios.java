package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 6.6;
		
		String resultadopar = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadofin = media >= 7.0 ? "aprovado" : resultadopar;
			
		
			System.out.println("O aluno esta " + resultadofin);
				
		
		
		
	}

}
