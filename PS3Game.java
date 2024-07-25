
package Prueba1;

import java.util.Calendar;

public class PS3Game extends RentItem {
    private Calendar fecha;

    public PS3Game(int codigo, String nombre, double precio){
            super (codigo,nombre,30);
            fecha = Calendar.getInstance();
        }

    public String toString(){
            return super.toString() + "Fecha de publicacion: " + fecha + "– PS3 Game";
        }
    
    public void setFechaPublicacion(int year, int mes, int dia){
        
    }
                
    public double pagoRenta(int dias){
        return precio*dias;
    }
    public String subMenu(){
        return super.subMenu() + "\n2-Actualizar Fecha de Publicacion";
    }
    
    public void ejecutarOpcion (int opcion){
        if (opcion==1){
            System.out.println(toString()); 
        } else if (opcion==2){
            System.out.println("Ingrese la fecha: ");
        } else {
            System.out.println("Opcion no valida"); 
        }
    }
    
}
