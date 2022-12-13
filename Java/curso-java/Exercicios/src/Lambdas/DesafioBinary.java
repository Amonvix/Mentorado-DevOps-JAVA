package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinary {
    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, .13);

        // Calculo precoReal  = (x,y) -> x*(1-y);
        // System.out.println("Valor sem impostos");
        // System.out.println((precoReal.executar(p.preco, p.desconto)));
        
        
        // double precoTotal = (precoReal.executar(p.preco, p.desconto));
        // if (precoTotal >=2500 ) {
        //     precoTotal = precoTotal + (precoTotal * (8.5/100));
        // }
        // System.out.println("Valor com impostos");
        // System.out.println(precoTotal);
        
        // double comFrete;
        // if (precoTotal >= 3000) {
        //     comFrete = precoTotal + 100;
        // }
        // else{
        //     comFrete = precoTotal + 50;
        // }
        
        // System.out.printf("O valor total da compra com frete foi de R$%.2f",comFrete);
        
        // System.out.println();
        // System.out.println();

        // BinaryOperator<Double> desc = (x,y) -> x*(1-y);
        // Function <Double, Double > imp = numero -> numero >= 2500 ? numero + (numero * (8.5/100)) : numero;
        // Function <Double, Double > frete = numero -> numero >= 3000 ? numero + 100 : numero + 50;

        // Double resultado = (desc.andThen(imp).andThen(frete).apply(p.preco, p.desconto));
        
        // meuImprimir(resultado);
        System.out.println();

        Function<Produto, Double> pfinal = prod -> (prod.preco * (1-prod.desconto));
        UnaryOperator <Double> imposto = preco -> preco >= 2500 ? preco + (preco * (8.5/100)) : preco;
        UnaryOperator <Double> entrega = numero -> numero >= 3000 ? numero + 100 : numero + 50;
        UnaryOperator <Double> arredondar = numero -> Double.parseDouble(String.format("%.7s", numero));
        Function <Double , String> formatar = numero -> ("R$" + numero).replace(".", ",");

        String preco = pfinal.andThen(imposto).andThen(entrega).andThen(arredondar).andThen(formatar).apply(p);

        // System.out.println(pfinal.andThen(imposto).andThen(entrega).andThen(arredondar).andThen(formatar).apply(p));
        System.out.println("O valor da compra é " +preco);



        
        


        /*
         * 1. A partir do produto calcular o preço real (com desconto)
         * 2. Imposto municipal: >=2500 (8,5%)/ < 2500 (isento)
         * 3. Frete: >= 3000 (100)/ < 3000 (50)
         * 4. Arredondar: Deixar 2 casas decimais
         * 5. Formatar: R$1234,56
         */
        
         }}
