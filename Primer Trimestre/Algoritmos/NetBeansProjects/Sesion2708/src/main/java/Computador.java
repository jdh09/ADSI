
import java.sql.Date;

public class Computador {
    //ATRIBUTOS
    private String marca;
    private double precio;
    private String modelo;
    private int ram;
    private String sistema;
    private int nucleos;
    private Date fecha;
    
    //CONSTRUCTORES

    public Computador() {
    }

    public Computador(String marca, double precio, String modelo, int ram, String sistema, int nucleos, Date fecha) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.sistema = sistema;
        this.nucleos = nucleos;
        this.fecha = fecha;
    }
    
    //METODOS

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    

}
