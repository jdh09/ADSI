
package condicionales;

import java.util.Scanner;


public class condicionales3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int cod,CON1=2,CON2=3,CON3=5;
        System.out.println("Ingrese codigo de empleado");
        cod=teclado.nextInt();
        
        if(cod%CON1==0 && cod%CON2==0 && cod%CON3==0){
            System.out.println("Su categoria es: Director general");
         }else if(cod%CON2==0 && cod%CON3==0){
            System.out.println("Su categoria es: Directivo");
            }else if(cod%CON1==0){
            System.out.println("Su categoria es: Personal");
                }else{
                System.out.println("Su categoria es: Seguridad");
                
            }
        
    }
}
