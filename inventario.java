
package generico;

import java.util.ArrayList;
import java.util.List;


public class inventario<T extends Contenido>{
    public List<T> materiales = new ArrayList<T>();
    
    public void Agregar(T material){
        materiales.add(material);
    }
    
    public void mostrarInvetario(){
    for(T m:materiales){
        m.showInfo();
        
    }
    
    }
}
