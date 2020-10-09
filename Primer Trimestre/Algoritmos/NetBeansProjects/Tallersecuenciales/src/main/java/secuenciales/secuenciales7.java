
package secuenciales;
import java.util.Scanner;


public class secuenciales7 {
        public static void main(String[] args){
        Scanner teclado=new Scanner(System.in); 
        
        double numero, cuadrado;
        
            System.out.println("Ingrese un numero");
            numero=teclado.nextDouble();
            
            cuadrado=Math.pow(numero, 2);
            
            System.out.println("el cuadrado es "+ cuadrado);
            
                
        }    
}
