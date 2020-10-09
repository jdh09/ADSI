
package secuenciales;

import java.util.Scanner;


public class secuenciales18 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    //x%= a/b*100
    
    double cantGrupo, cantH, cantM, porcH, porcM, CON=100;
    
        System.out.println("Ingrese la cantidad de alumnos");
        cantGrupo=teclado.nextDouble();
        System.out.println("Cantidad de hombres");
        cantH=teclado.nextDouble();
        System.out.println("Cantidad de mujeres");
        cantM=teclado.nextDouble();
        
        porcH=(cantH/cantGrupo)*CON;
        porcM=(cantM/cantGrupo)*CON;
        
        System.out.println("El porcentaje de mujeres es: "+porcM+ "  el porcentaje de hombres es: "+porcH);
        

        
    

    }
  
}
