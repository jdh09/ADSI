/*
 ingresar edads hasta que el usuario diga que no desea ingresar mas registros
calcular el promedio de los mayores de edad, y el numero de personas mayores de edad,
cuente en numero que ingresaron
 */
package cicloMientras;

import java.util.Scanner;

/**
 *
 * @author juan david
 */
public class Bandera {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String sw;//variable swich, interruptor, bandera
        int edad,contadorMayores=0,contadorTotal=0;
        double promedioMayores,acumuladorMayores=0;
        
        System.out.println("desea ingresar registros s/n");
        sw=teclado.next();
        while(sw.equals("s")){
            System.out.println("ingrese edad");
            edad=teclado.nextInt();
            contadorTotal=contadorTotal+1;//numero de edades ingresadas
            if(edad>=18){
                contadorMayores=contadorMayores+1;
                acumuladorMayores=acumuladorMayores+edad;   
            }
            System.out.println("desea ingresar registros s/n");
            sw=teclado.next();   
        }
        promedioMayores=acumuladorMayores/contadorMayores;
        System.out.println("promedio de los mayores de edad: "+promedioMayores);
        System.out.println("Numero de personas mayores de edad: "+contadorMayores);
        System.out.println("numero total que ingresaron: "+contadorTotal);
    }
}
