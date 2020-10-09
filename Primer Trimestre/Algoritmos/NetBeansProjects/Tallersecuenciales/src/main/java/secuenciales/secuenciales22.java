
package secuenciales;

import java.util.Scanner;


public class secuenciales22 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    int a, b;
    
        System.out.println("ingrese valor A");
        a=teclado.nextInt();
        System.out.println("ingrese valor B");
        b=teclado.nextInt();
        //a=40 b=30
        a=(a+b);// 40+30=70
        b=(a-b);//70-30=40
        a=(a-b);//70-40=30
        System.out.println("El nuevo valor de A es: "+a);
        System.out.println("El nuevo valor de B es: "+b);
        
        
        

    }
  
}
