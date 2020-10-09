/*
 
 */
package cicloMientras;

import java.util.Scanner;

/**
 *
 * @author juan david
 */
public class Bandera2 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
      
       String sw;
       int numFac,cant,contadorFacturas=0,contadorMayores=0;
       double valorUnit,totXfactura = 0, totalTfacturas,acumuladorFacturas=0;
       
        System.out.println("Desea ingresar factura s/n");
        sw=teclado.next();
                while(sw.equals("s")){
                    System.out.println("Ingrese elnumero de factura");
                    numFac=teclado.nextInt();
                    System.out.println("ingrese la cantidad de articulos");
                    cant=teclado.nextInt();
                    System.out.println("ingrese el valor unitario del producto");
                    valorUnit=teclado.nextDouble();
                    totXfactura=cant*valorUnit;

                    acumuladorFacturas=acumuladorFacturas+totXfactura;
                    contadorFacturas=contadorFacturas+1;
                    if(totXfactura>500000){
                        contadorMayores=contadorMayores+1;
                    }
                    System.out.println("Desea ingresar factura s/n");
                    sw=teclado.next();
                }
                totalTfacturas=totXfactura*contadorFacturas;

                System.out.println("El total de cada factura es: "+totXfactura);
                System.out.println("El total de todas las facturas es: "+totalTfacturas);
                System.out.println("La cantidad de facturas ingrsadad es: "+contadorFacturas);
                System.out.println("La cantidad de facturas mayores a 500000es: "+contadorMayores);
                
        
    } 
}
