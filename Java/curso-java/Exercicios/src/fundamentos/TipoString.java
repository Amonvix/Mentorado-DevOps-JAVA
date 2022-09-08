package fundamentos;

public class TipoString {
	
//	arquivo criado para entendimento dos tipos de operadores a ser empregados em Strings
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2)); // por não ser um tipo primitivo, operadores podem ser inseridos, como esta contagem index
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!")); // concatenação do valor à variavel
		System.out.println(s + "!!!");		 // mesmo do anterior
		
		System.out.println(s.startsWith("Boa"));	// Verifica a exitencia da string no inicio da variavel
		System.out.println(s.endsWith("noite"));	// Verifica a exitencia da string no final  da variavel
		System.out.println(s.toLowerCase());		// Altera a variavel para o valor em caixa alta
		System.out.println(s.toUpperCase());		// Altera a variavel para o valor em caixa baixa
		System.out.println(s.length());				// Efetua a contagem de caracteres na string (incluindo espaços)
		System.out.println(s.equals("boa tarde"));	// Verifica a igualdade da string com a variavel
		System.out.println(s.equalsIgnoreCase("boa tarde"));	// A mesma verificação que a anterior, porém sem a ser Case sensitive
		
		var nome = "Pedro";			// Inferido tipo String na variavel
		var sobrenome = "Santos";	// Inferido tipo String na variavel
		var idade = 33;				// Inferido tipo Double na variavel
		var salario = 1500.9988;		// Inferido tipo Double na variavel
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " \nidade: " + idade + "\nSalario R$:" + salario + "\n\n"); // forma concatenada de exibir os resultados
		
		System.out.printf("O Senhor %s %s, tem %d anos e recebe mensalmente o montante de R$ %.2f.",nome , sobrenome , idade , salario ); // modo printf de exibir o resultado formatado

		
		
		
		
		
	}

}
