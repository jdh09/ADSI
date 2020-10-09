
package secuenciales;

import java.util.Scanner;

public class secuenciales5 {
      public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double base, altura, area, CONST=2;
        
          System.out.println("Area de un triangulo");
          
          System.out.println("Ingrese base en cms");
          base=teclado.nextDouble();
          System.out.println("Ingrese altura en cms");
          altura=teclado.nextDouble();
          
          area=(base*altura)/CONST;
          
          System.out.println("El area delrectangulo es "+area+ " cms");
          
    }    
}
      
