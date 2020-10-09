
package cicloMientras;

import java.util.Scanner;


public class banderas3 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int numero;
       boolean sw=true;
    /*   while(sw){
           System.out.println("Ingrese el numero");
           numero=teclado.nextInt();
           sw=!(numero>=0 && numero<=10);
         
       }*/
    while (sw){
        System.out.println("Ingrese el numero");
        numero=teclado.nextInt();
        if(numero>=0 && numero<=10){
            sw=false;
        }
    }


    }
  
}
