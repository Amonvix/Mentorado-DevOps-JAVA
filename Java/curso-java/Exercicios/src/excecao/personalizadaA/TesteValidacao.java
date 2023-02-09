package excecao.personalizadaA;

public class TesteValidacao {
    public static void main(String[] args) {
        
        try {
            Aluno aluno = new Aluno("Ana", 20);
            validar.usuario(aluno);
        } catch (StringVaziaException | numeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");

    }
}
