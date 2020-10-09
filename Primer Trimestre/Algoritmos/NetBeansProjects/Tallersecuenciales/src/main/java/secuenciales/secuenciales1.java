
package secuenciales;

import java.util.Scanner;

/**
 *
 * @author juan david
 */
public class secuenciales1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n1, n2, n3, suma, division;
      
        
        System.out.println("ingrese dos numeros");
        n1= teclado.nextInt();
        n2= teclado.nextInt();
        
        suma= (n1+n2);
        
        System.out.println("La suma es  "+ suma);
        
        System.out.println("divida por");
        n3=teclado.nextInt();
        
        division= (suma/n3);
        
        System.out.println("El resultado es  "+division);
        
        
        
        
        
        
        
        
        
        
    }
}
