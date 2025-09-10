
package generico;

public class revista extends Contenido{
    
    public String Fotografo;
    public revista(String Titulo,String autor, int año, String fotografo){
        super(Titulo, autor, año);
        this.Fotografo = fotografo;
        
    }
      @Override
    public void showInfo(){
        System.out.println("Titulo:" + this.Titulo +"autor:" + this.autor + "Año: "+ this.añoPublicacio + "fotografo: "+this.Fotografo);
    }
    
    
    
    
    
}
