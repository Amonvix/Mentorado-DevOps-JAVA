package testes;
public class lotofacil {
    
    public static void main(String[] args) { 

         int ii=2741;

        // Jogos apostados!
        int [] aposta1 = {1,3,4,5,7,10,11,12,13,17,18,19,21,23,25};
        int [] aposta2 = {1,2,3,6,7,8,9,14,15,16,18,20,22,23,24};

        // Resultado coletado do site na internet
        int []  j01 = {07,13,05,06,02,23,04,9,15,01,22,8,24,25,18};
        int []  j02 = {01,02,04,05,07,9,11,12,13,14,15,17,18,20,22};
        int []  j03 = {01,04,06,8,9,12,13,16,17,18,19,20,22,23,24};
        int []  j04 = {01,02,03,04,06,07,8,9,11,12,15,20,21,23,25};
        int []  j05 = {01,06,07,9,10,11,12,14,15,17,19,22,23,24,25};
        int []  j06 = {01,03,04,06,07,10,11,12,13,17,18,19,23,24,25};
        int []  j07 = {01,02,05,07,8,10,11,12,14,17,18,19,20,21,25};        
        int []  j08 = {01,02,04,05,06,8,9,10,12,14,16,19,22,23,24};        
        int []  j09 = {};        
        int []  j10 = {};        
        int []  j11 = {};        
        int []  j12 = {};
        

        System.out.println("********************");
        System.out.println("VALORES DO JOGO A!!!");
        System.out.println("********************");

        
        System.out.print(calculo(aposta1, j01));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j02));
        System.out.println(ii++);
        System.out.print(calculo(aposta1, j03));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j04));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j05));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j06));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j07));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j08));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j09));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j10));
        System.out.println(ii++);        
        System.out.print(calculo(aposta1, j11));
        System.out.println(ii++);
        System.out.print(calculo(aposta1, j12));
        System.out.println(ii++);


        
        System.out.println("********************");
        System.out.println("VALORES DO JOGO B!!!");
        System.out.println("********************");

        ii = 2741;
        System.out.print(calculo(aposta2, j01));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j02));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j03));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j04));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j05));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j06));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j07));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j08));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j09));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j10));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j11));
        System.out.println(ii++);
        System.out.print(calculo(aposta2, j12));  
        System.out.println(ii++);   
        }

    public static String calculo(int[] aposta1, int[] j01){        
        Boolean win = false;
        String mensagem1 = ""; 
        String mensagem2 = ""; 
        int i = 0;
        for(int j: aposta1){
            for (int r : j01){
                if (j == r) {                  
                    i++;
                    if ( i == 15){ 
                        win = true;}
                        else win = false; 
                    }
                }
            }
            if (win == true){
                mensagem1 = "\nForam" + i + " acertos no jogo ********ACERTOU OS 15 !!!?********\n";
                
                return mensagem1 ;
            }
            else {
                mensagem2 = "Foram " + i + " acertos no jogo " ;
                return mensagem2;
        }
    } 
}