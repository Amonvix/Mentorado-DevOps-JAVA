package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	

	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
		
	
	}
	Data(int diaIni, int mesIni, int anoIni){
		dia = diaIni;
		mes = mesIni;
		ano = anoIni;		
	}


	String DataFormatada(){
		return String.format("%d/%d/%d", dia , mes, ano);
	}

	void imprimirDataFormatada(){
		System.out.println(DataFormatada());


	}

	
}

