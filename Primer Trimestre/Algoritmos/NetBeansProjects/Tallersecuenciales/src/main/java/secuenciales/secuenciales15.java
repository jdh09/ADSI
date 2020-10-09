
package secuenciales;

import java.util.Scanner;


public class secuenciales15 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    //F= (1,8) *C +32
    double cel, fahr, CON1=1.8, CON2=32; 
    
        System.out.println("ingrese grados celsius");
        cel=teclado.nextDouble();
        
        fahr=(CON1)*cel+CON2;
        
        System.out.println("grados Fahrenheit: "+fahr);
        

    }
 
}
