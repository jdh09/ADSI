
package secuenciales;

import java.util.Scanner;


public class secuenciales17 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double metros, cent,CON=100;
    
        System.out.println("ingrese la cantidad en metros");
        metros=teclado.nextDouble();
        
        cent=(metros*CON);
        
        System.out.println("la cantidad en centimetros es: "+cent);
        
        

    }
 
}
