
package secuenciales;
import java.util.Scanner;


public class secuenciales8 {
      public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        double num1, num2, num3, num4, suma, promedio, CONST=4;
        
          System.out.println("Ingrese cuatro numeros");
          num1=teclado.nextDouble();
          num2=teclado.nextDouble();
          num3=teclado.nextDouble();
          num4=teclado.nextDouble();
          
          suma=(num1+num2+num3+num4);
          promedio=(suma/CONST);
          
          System.out.println("La suma de los numeros es "+suma+ " y el promedio es "+promedio);
          
      }    
}
