
 public class Automovil {
    private String color;
    private int precio;
    private String marca;
    private int modelo;
    
    //Constructor default
    
    public Automovil () {   
    }
    public Automovil(String color, int precio,String marca,int modelo){ 
      this.color= color;
      this. precio= precio;
      this.marca= marca;
      this.modelo= modelo;
      
    }
    
    //getter
    public String getmarca(){
        return marca; 
     }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public int getModelo() {
        return modelo;
    }
    
    
    //setter
    public void setmarca(String marca){
        this.marca= marca;
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
 }
        

