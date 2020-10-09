
public class Principal {
    
    public static void main(String[] args) {
        //Declarar objetos
        Automovil auto1, carromiguel;
        //Instalar objetos
        auto1= new Automovil();
        carromiguel= new Automovil("Blanco ", 5000000, "Renault ", 1990);
        System.out.println("----Auto 1----");
        System.out.println("color: "+ carromiguel.getColor());
         System.out.println("color: "+ carromiguel.getModelo());
         
    }   
   
}
