package Datess.dio;

import java.time.Instant;
import java.util.Date;

public class DatasDio {
   public static void main(String[] args) {
        
        /*Date newData = new Date();
        System.out.println(newdata);*/
        
        /*Long currentTimeMillis = System.currentTimeMillis();
            System.out.println(currentTimeMillis); 
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
        
        Date dataNoPassado = new Date(1667845950498L);       
        Date dataNoFuturo = new Date(1767845950498L);
        /** comparar se a dataNoPassado é posterior a dataNoFuturo */       
        /*boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);
        
        /** comparar se a dataNoPassado é anterior a dataNoFuturo */    
        /*boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);*/
        /*Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017
        Date dataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021
        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se as datas são iguais */
        /*boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
        /*int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3);*/
        
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z
        
      
                
    
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
