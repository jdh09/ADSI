
package ModificadorPrivado;

/**
 *
 * @author juan david
 */
public class Privado {
    private void mostrar(){
        System.out.println("Modificador privado");
        
        
    }
    public static void main(String[] args) {
        Privado obj=new Privado();
        obj.mostrar();
        
    }
    
}
