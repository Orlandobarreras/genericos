
package generico;


public abstract class Contenido {
   public String Titulo;
    public String autor;
    public int añoPublicacio;
    public Contenido(String Titulo, String autor,int año){
        this.Titulo = Titulo;
        this.autor = autor;
    this.añoPublicacio = año;
    
}
    public abstract void showInfo();
}