package excecao.personalizadaB;

public class validar {
    private validar(){}

    public static void usuario(Aluno aluno) throws StringVaziaException, numeroForaIntervaloException{

        if (aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");            
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }
        if (aluno.nota < 0 || aluno.nota > 10){
            throw new numeroForaIntervaloException("nota");
        }

    }



    
}
