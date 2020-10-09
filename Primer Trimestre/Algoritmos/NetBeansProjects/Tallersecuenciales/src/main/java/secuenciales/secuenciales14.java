
package secuenciales;

import java.util.Scanner;


public class secuenciales14 {
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      
      String art1, art2,art3;
      double cant1, cant2, cant3, valUnit1, valUnit2, valUnit3, subT1, subT2, subT3, total;
      
        System.out.println("ingrese articulo");
        art1=teclado.next();
        System.out.println("ingrese cantidad");
        cant1=teclado.nextDouble();
        System.out.println("Ingrese valor");
        valUnit1=teclado.nextDouble();
        subT1=(cant1*valUnit1);
        System.out.println("subtotal "+subT1);
        
        System.out.println("ingrese articulo");
        art2=teclado.next();
        System.out.println("ingrese cantidad");
        cant2=teclado.nextDouble();
        System.out.println("Ingrese valor");
        valUnit2=teclado.nextDouble();
        subT2=(cant2*valUnit2);
        System.out.println("subtotal "+subT2);

        
        System.out.println("ingrese articulo");
        art3=teclado.next();
        System.out.println("ingrese cantidad");
        cant3=teclado.nextDouble();
        System.out.println("Ingrese valor");
        valUnit3=teclado.nextDouble();
        subT3=(cant3*valUnit3);
        System.out.println("subtotal "+subT3);

        
        
        total=(subT1+subT2+subT3);
        
        System.out.println("el valor total de la factura es: "+total);
        
        

    }
   
}
