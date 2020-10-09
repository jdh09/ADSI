

package secuenciales;
import java.util.Scanner;


public class secuenciales2 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);  
        
        double numero, raiz;
        
        System.out.println("Ingrese un numero para obtener su raiz cuadrada");
        numero=teclado.nextDouble();
        
        raiz= Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de "+ numero+ "es "+raiz);
        
    }   
}
