
package generico;


public class Generico {

    public static void main(String[] args) {
       
        inventario<Contenido> inventario = new inventario<>();
        revista rev = new revista("Forves","Alguien",2025,"Alfonso");
        Libre libro = new Libre("Nose","Alguien",2025);
        inventario.Agregar(rev);
        inventario.Agregar(libro);
        
      
        
        
        
    }
    
}
