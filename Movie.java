
package Prueba1;


public class Movie extends RentItem {
    private String estado;
    
    
    public Movie(int codigo, String nombre, double precio){
        super (codigo,nombre,precio);
        estado = "ESTRENO";
    }
    
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getEstado(){
        return estado;
    }
    
    public String toString(){
        return super.toString() + "\nEstado: " + estado + "- Movie";
    }
    
    public double pagoRenta(int dias){
        if (estado.equals("ESTRENO") && dias>2){
            return precio + (50*(dias-2));
        } else if (estado.equals("NO ES ESTRENO") && dias>2){
        } return precio + (30*(dias-2));
    }
         
    public String subMenu(){
        return super.subMenu() + "\n2-Cambiar";
    }
    
     public void ejecutarOpcion (int opcion){
        if (opcion==1){
            System.out.println(toString()); 
        } else if (opcion==2){
            System.out.println("Ingrese el estado: ");
        } else {
            System.out.println("Opcion no valida"); 
        }
    }
    
    
}
