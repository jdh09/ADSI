
package secuenciales;

import java.util.Scanner;


public class secuenciales21 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    int n1,n2,aux;
        System.out.println("ingree el primer numero");
        n1=teclado.nextInt();
        System.out.println("ingrese segundo nuero");
        n2=teclado.nextInt();
        aux=n1;
        n1=n2;
        n2=aux;
        
        System.out.println("El nuevo valor de la primer variable es: "+n1);
        System.out.println("El nuevo valor de la segunda variable es: "+n2);  
        
               
        

    }
 
}
