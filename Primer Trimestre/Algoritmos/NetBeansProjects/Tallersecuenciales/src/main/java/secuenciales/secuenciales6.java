
package secuenciales;
import java.util.Scanner;


public class secuenciales6 {
     public static void main(String[] args){
        Scanner teclado=new Scanner(System.in); 
        
        String empl1, empl2, empl3;
        double salario1, salario2, salario3, AUM1=1.10, AUM2=1.12, AUM3=1.15, total1, total2, total3;
        int doc1, doc2, doc3;
        
         System.out.println("Ingrese nombre del empleado");
         empl1=teclado.next();
         System.out.println("Ingrese numero de documento");
         doc1=teclado.nextInt();
         System.out.println("Ingrese salario");
         salario1=teclado.nextDouble();
         
         total1=(salario1*AUM1);
         
        
         System.out.println("Ingrese nombre del empleado");
         empl2=teclado.next();
         System.out.println("Ingrese numero de documento");
         doc2=teclado.nextInt();
         System.out.println("Ingrese salario");
         salario2=teclado.nextDouble();
         
         total2=(salario2*AUM2);
         
         System.out.println("Ingrese nombre del empleado");
         empl3=teclado.next();
         System.out.println("Ingrese numero de documento");
         doc3=teclado.nextInt();
         System.out.println("Ingrese salario");
         salario3=teclado.nextDouble();
         
         total3=(salario3*AUM3);
         
         System.out.println("El salario de "+empl1+ " es "+total1+ " el salario de "+empl2+ " es "+total2+ " el salario de "+empl3+ " es "+total3);
         



 

         
        
    }
}
