package ifs.dio;
public class Ifsdio {

    public static void main(String[] args) {
       
        final var condicao = true;
            if (condicao){
                System.out.println("A condicao e verdadeira");}
            else{
                System.out.println("A condicao e falsa");
       }
            if(condicao)/*só se a condição for verdadeira */
                System.out.println("Em uma unica linha");
        
        final var ternario = condicao ? "e verdadeira" : "e falsa";
            System.out.println(ternario);/* Ternario é um tipo de if*/
            
    }
}

