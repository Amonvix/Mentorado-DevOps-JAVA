package classe;

public class DataTeste {
	
	
	
	public static void main(String[] args) {
		
		Data eu =  new Data();
		// eu.dia = 02;
		// eu.mes = 02;
		// eu.ano = 1985;
		
		
		Data dani = new Data(23,06,1981);
		
				
		System.out.println();
		System.out.println(eu.DataFormatada());
		System.out.println(dani.DataFormatada());

		eu.imprimirDataFormatada();
		dani.imprimirDataFormatada();

		
		
	}

}
