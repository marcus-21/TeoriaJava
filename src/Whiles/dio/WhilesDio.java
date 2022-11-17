package Whiles.dio;
    

public class WhilesDio {
    public static void main(String[] args) {
        var x = 0;
        
        while(x<2){
            System.out.println("Estou dentro do while X");
            x++;
        }
        var y = 0;
        
        do {
            System.out.println("Dentro do While Y");
        } while (y++ < 2);
        
    }
}
