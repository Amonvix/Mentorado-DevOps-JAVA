package excecao.personalizadaB;

public class numeroForaIntervaloException extends Exception{

    private String nomeDoAtributo;

    public numeroForaIntervaloException (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s é invalido! ",nomeDoAtributo);
    }

    
}
