package classe;

public class Equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "João da Silva";
        u1.email = "joao@teste.com";

        Usuario u2 = new Usuario();
        u2.nome = "João da Silva";
        u2.email = "joao@teste.com";

        System.out.println(u1 == u2);
        System.out.println(u2 == u1);
        

        System.out.println(u1.equals(u2));




    }
    
}
