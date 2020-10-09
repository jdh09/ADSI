
package secuenciales;

import java.util.Scanner;


public class secuenciales13 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       
       String nombre;
       double salario,deduccion, bonificacion, DEDUC=0.02, BONI=0.10, total;
       int doc;
       
        System.out.println("Ingrese elmombre del empleado");
        nombre=teclado.next();
        System.out.println("ingrese el numero de documento");
        doc=teclado.nextInt();
        System.out.println("ingrese salario");
        salario=teclado.nextDouble();
        
        deduccion=(salario*DEDUC);
        bonificacion=(salario*BONI);
        total=(salario-deduccion)+bonificacion;
        
        System.out.println("El total del salario es: "+total);
        
        
        
      
        
               

    }
 
}
