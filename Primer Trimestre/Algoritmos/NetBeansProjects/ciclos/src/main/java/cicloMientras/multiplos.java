
package cicloMientras;

import java.util.Scanner;


public class multiplos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,numero,contador=0;
        double acuMultiplo=0,promedio,acuTotal=0;
        
        System.out.println("Ingrese N numeros");
        n=teclado.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println(" Ingresar el numero");
            numero=teclado.nextInt();
            acuTotal=acuTotal+numero;
            if(numero%2==0){
                acuMultiplo=acuMultiplo+numero;
            }
            if(numero%5==0 && numero%7==0){
                contador=contador+1;
            }
            promedio=acuTotal/n;
            System.out.println("la suma de multiplos de 2 es: "+acuMultiplo);
            System.out.println("Total numeros multiplos de 5 y 7: "+contador);
            System.out.println("El promedio "+promedio);
            
        }
    }
}
