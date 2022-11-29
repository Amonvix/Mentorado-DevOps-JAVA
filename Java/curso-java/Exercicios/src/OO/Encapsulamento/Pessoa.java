package OO.Encapsulamento;

public class Pessoa {
    
    private String nome;    
    private int idade;

    Pessoa (String nome, int idade){
        setNome(nome);
        setIdade(idade);
        
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade (int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
            
            
        }
        
        
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public String toString(){
        return "Olá, meu nome é " +getNome() + " e eu tenho " + getIdade() + " anos";


    }
    
}




