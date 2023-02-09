package excecao.personalizadaB;

public class TesteValidacao {
    public static void main(String[] args) {
        
        try {
            Aluno aluno = new Aluno("Ana", 20);
            validar.usuario(aluno);

            validar.usuario(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
            
        }catch (numeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("fim");

    }
}
