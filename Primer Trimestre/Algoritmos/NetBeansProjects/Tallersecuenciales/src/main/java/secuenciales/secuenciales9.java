
package secuenciales;
import java.util.Scanner;


public class secuenciales9 {
     public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double PULGADA=2.54, PIE=12*PULGADA, altPulg, altPie, altCms;
        
         System.out.println("ingrese altura en cms");
         altCms=teclado.nextDouble();
         
         altPulg=(altCms/PULGADA);
         altPie=(altCms/PIE);
         
         System.out.println("la altura en pulgadas es "+altPulg+" La altura en pies es "+altPie);
         
         
        
        
        
        
     }    
}
