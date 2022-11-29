package OO.heranca.Desafio;

public class Carro {

    public final int VEL_MAX;
    public int VelAtual = 65;
    private int velmed = 5;

    Carro (int velmax){
        VEL_MAX = velmax; 
    }

    
    public void acelerar(){
    if (VelAtual + getVelmed()>= VEL_MAX) {
        VelAtual = VEL_MAX;
    }
    else{

        VelAtual += getVelmed();
    }
}

public void frear(){
    if (VelAtual >0 ){

        VelAtual -= getVelmed()*2;
    }
    else if (VelAtual <= 0 ){
        System.out.println("O veiculo ja esta parado");       

    }

}

public String toString(){
    return "Velocidade atual é " + VelAtual + "Km/h";

}


public int getVelmed() {
    return velmed;
}


public void setVelmed(int velmed) {
    this.velmed = velmed;
}






}
