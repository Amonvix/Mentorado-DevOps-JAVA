package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		String nome = "valor";
		for (int  i = nome.length(); i > 0; i--) {
			System.out.println(valor);
			valor += "#";
		}
		
		//solução
		
		for (String v = "#"; !v.equals("######"); v +="#") {
		System.out.println(v);
	}
	
	
	}}
