
package secuenciales;

import java.util.Scanner;


public class secuenciales16 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double num1, num2, num3, CON=5, suma, total;
    
        System.out.println("Ingrese tres numeros");
        num1=teclado.nextDouble();
        num2=teclado.nextDouble();
        num3=teclado.nextDouble();
        
        suma=(num1+num2+num3);
        total=(suma/CON);
        
        System.out.println("La suma de los numeros es: "+suma+" la quinta parte es: "+total);
        
        



    }
}
