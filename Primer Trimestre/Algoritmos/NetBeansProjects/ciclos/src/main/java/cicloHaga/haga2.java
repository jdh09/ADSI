
package cicloHaga;

/**
 *
 * @author juan david
 */
public class haga2 {
    public static void main(String[] args) {
        
       int i=1;//inicio del ciclo
       double acumulador=0;
       do
       {
           acumulador=acumulador+i;
           i++;//incremento del ciclo
       }while(i<=10);//fin del ciclo
        System.out.println(acumulador);
    }
    
}
