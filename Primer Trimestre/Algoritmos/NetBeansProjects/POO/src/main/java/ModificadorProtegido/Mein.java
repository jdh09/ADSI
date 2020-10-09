
package ModificadorProtegido;

/**
 *
 * @author juan david
 */
public class Mein {
    public static void main(String[] args) {
        Protegido obj=new Protegido();
        obj.mostrar();//se llama de cualquier clase del mismo paquete
    }
}
