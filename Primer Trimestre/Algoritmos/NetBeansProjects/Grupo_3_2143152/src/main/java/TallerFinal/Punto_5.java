
package TallerFinal;

import java.util.Scanner;


public class Punto_5 {
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
      double suma=0, mayImp=0, mayPar=0;
      int pos=0;
      int[]vec={40,25,10,11,50,80,6,99,1,3,20,32,71,15,92,87,98,18,9,39};
      
        for (int i = 0; i < vec.length; i++) {
            if(i%2==0 && i!=0){
                suma=suma+vec[i];
               
            }
        }
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]>mayImp && vec[i]%2!=0){
            mayImp=vec[i];
             
            }
         
        }
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]>mayPar && vec[i]%2==0){
                mayPar=vec[i];
                pos=i;
                
            }
        }
        System.out.println("La suma de los elementos que ocupan posiciones pares es: "+suma);
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("el mayor de los elementos que ocupan posiciones impares es: "+mayImp);
        System.out.println("");
        System.out.println("----------------------------------------------------");
        System.out.println("La posicion del mayor numero par es: "+pos);
   }
}
