
package generico;


public class Libre extends Contenido {

public Libre(String Titulo, String autor, int año) {
   super(Titulo,autor,año); 
}  
  @Override
    public void showInfo(){
        System.out.println("Titulo: "+this.Titulo+"autor: "+this.autor+"Año: "+this.añoPublicacio);
    }
    
}
