
package AmbitodeVariable;

/**
 *
 * @author juan david
 */
public class AmbitodeVariables {
    static int variableStatica;//Variable statica no require instanciar
    int variableGlobal;
    
    //Metodo vacio sin parametros
    public void metodo1(){
        //Variable local
       int variableLocal=10;//Las variables locales es recoendable inicializarlas
        System.out.println(variableLocal);
    }
    public void metodo2(){
        System.out.println(variableStatica);
        System.out.println(variableGlobal);
        //System.out.println(variableLocal);//no funciona porque es local
    }
    public static void main(String[] args) {
        AmbitodeVariables obj= new AmbitodeVariables();//en el metodo mein se requiere crear objeto, instanciar
        obj.variableGlobal=9;
        
        //Sin usar el objeto llamamos la variable statica
        variableStatica=10;
    }
    
}
