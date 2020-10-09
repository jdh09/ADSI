
package secuenciales;
import java.util.Scanner;



public class secuenciales4 {
     public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String nomEmpleado;
        double horasLaboradas, total, VALORHORA= 20000;
        int documento;
        
         System.out.println("Ingrese nombre del empleado");
         nomEmpleado=teclado.next();
         System.out.println("Ingrese el numero de documento");
         documento=teclado.nextInt();
         System.out.println("ingrese el numero de horas laboradas en el mes");
         horasLaboradas=teclado.nextDouble();
         
         total=(horasLaboradas*VALORHORA);
         
         System.out.println("El total a pagar es "+total);
         
    }
}
