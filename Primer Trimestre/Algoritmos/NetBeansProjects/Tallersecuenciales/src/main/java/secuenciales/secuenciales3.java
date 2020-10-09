
package secuenciales;
import java.util.Scanner;

public class secuenciales3 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in); 
        
        String nomEstudiante;
        double nota1, nota2, nota3, promedio, PRO=3;
        
        System.out.println("Ingrese el nombre del estudiante");
        nomEstudiante=teclado.next();
        
        System.out.println("Ingrese nota");
        nota1=teclado.nextDouble();
        System.out.println("Ingrese nota");
        nota2=teclado.nextDouble();
        System.out.println("Ingrese nota");
        nota3=teclado.nextDouble();
        
        promedio=(nota1+nota2+nota3)/PRO;
        
        System.out.println("Su promedio es "+ promedio);
        
    }    
}
