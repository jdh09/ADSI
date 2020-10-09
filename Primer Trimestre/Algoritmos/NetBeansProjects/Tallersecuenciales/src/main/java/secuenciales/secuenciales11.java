
package secuenciales;
import java.util.Scanner;


public class secuenciales11 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
     
        String dia1, dia2, dia3;
        double time1, time2, time3, timeTot, prom, CONS=3 ;
        
        System.out.println("ingrese el dia");
        dia1=teclado.next();
        System.out.println("ingrese el tiempo en minutos");
        time1=teclado.nextDouble();
        
         System.out.println("ingrese el dia");
        dia2=teclado.next();
        System.out.println("ingrese el tiempo en minutos");
        time2=teclado.nextDouble();
        
        System.out.println("ingrese el dia");
        dia3=teclado.next();
        System.out.println("ingrese el tiempo en minutos");
        time3=teclado.nextDouble();
        
        timeTot=(time1+time2+time3);
        prom=(timeTot/CONS);
        
        System.out.println("El promedio que tarda en recorrer la misma ruta es: "+prom);
        
    }    
}
