package excecao;

public class Basico {

    public static void main(String[] args) {
        Aluno a1 = null;

        try{
            imprimirNomeDoAluno(a1);
        } catch(Exception execao){
            System.out.println("Ocorreu um erro na execução no nome do Aluno!");
        }

        try {
            System.out.println(8 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Ocorreu um erro: " + e.getMessage());
            
        }

        System.out.println("FIM");

    }

    public static void imprimirNomeDoAluno(Aluno Aluno){

        System.out.println(Aluno.nome);
    }
    
}
