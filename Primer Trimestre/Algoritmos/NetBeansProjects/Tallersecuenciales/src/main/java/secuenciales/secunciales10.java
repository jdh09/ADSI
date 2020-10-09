
package secuenciales;
import java.util.Scanner;


public class secunciales10 {
      public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
        String marca, referencia;
        double costoTotal, impuesto, gananciaVend, costoVehiculo, IMP=0.06, GANV=0.12;
        
          System.out.println("Ingrese la marca del veiculo");
          marca=teclado.next();
          
          System.out.println("Ingrese la referencia");
          referencia=teclado.next();
          
        
          System.out.println("Ingrese el costo del veiculo");
          costoVehiculo=teclado.nextDouble();
          
          impuesto=(costoVehiculo*IMP);
          gananciaVend=(costoVehiculo*GANV);
          costoTotal=(costoVehiculo+impuesto+gananciaVend);
          
          System.out.println("El automovil "+marca+ referencia+ " tiene un costo de:  ");
          System.out.println("costo del vehiculo "+costoVehiculo);
          System.out.println("impuesto "+impuesto);
          System.out.println("ganancia del vendedor "+gananciaVend);
          System.out.println("costo total del vehiculo: "+costoTotal);
          
          
          
          
                
                
    
      }
      
}
