
package secuenciales;

import java.util.Scanner;


public class secuenciales19 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    String per1, per2, per3;
    double inv1, inv2, inv3, totInv, por1, por2, por3, CON=100;
    
        System.out.println("ingrese el nombre");
        per1=teclado.next();
        System.out.println("Ingrese el monto de la inversion");
        inv1=teclado.nextDouble();
        
         System.out.println("ingrese el nombre");
        per2=teclado.next();
        System.out.println("Ingrese el monto de la inversion");
        inv2=teclado.nextDouble();
        
         System.out.println("ingrese el nombre");
        per3=teclado.next();
        System.out.println("Ingrese el monto de la inversion");
        inv3=teclado.nextDouble();
        
        totInv=(inv1+inv2+inv3);
        por1=(inv1/totInv)*CON;
        por2=(inv2/totInv)*CON;
        por3=(inv3/totInv)*CON;
        
        System.out.println("El porcentaje de inversion de "+per1+" es: "+por1+ "%, de "+per2+" es: "+por2+ "%, de: "+per3+" es: "+por3+"%" );
        
        
        
        
        
        

        
        
        
        
        
    
    }
 
}
