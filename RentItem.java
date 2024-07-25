
package Prueba1;

public class RentItem {
    
    protected int codigo;
    protected String nombre;
    protected double precio;
    private int copias;
    
    public RentItem(int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        copias = 0;
    }
    
    public String toString(){
        return "Codigo: " + codigo + "\nNombre: " + nombre + "\nPrecio: " + precio;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCopias(){
        return copias;
    }
    
    public double pagoRenta(int dias){
        return 0;
    }
    public String subMenu(){
        return "1-Imprimir";
    }
    
    public void ejecutarOpcion (int opcion){
        if (opcion <=4 || opcion >=1)
            System.out.println(toString()); 
        System.out.println("Opcion no valida"); 
        
    }
    
    
    
}
