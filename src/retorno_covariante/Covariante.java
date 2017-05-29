/*
 * Un retorno covariante es la posibilidad de retornar en un metodo un subtipo 
    de la clase o tipo primitivo declarado como devolucion del metodo
 */
package retorno_covariante;

/**
 *
 * @author santi
 */
public class Covariante {
    /*  ejemplo de un retorno covariante, se puede retornar un subtipo del objeto de retorno.
        En este ejemplo -retornoCovariante()- se utiliza una interface como definicion de tipo, 
        la InterfaceCov es padre de InterCovHija, la implementacion de dicha interface se 
        realiza a travez de la variable inter que es retornada sin conflictos demostrando 
        el retorno covariante o de covarianza.
    */
    public InterfaceCov retornoCovariante(){
        InterCovHija inter= new InterCovHija() {};
        return inter;
    }
    //retorno de un subtipo de dato primitivo
   public int retornoInt(){
      short corto=3; 
       return corto;
   }
   /*   equivalencia al retorno por interface  pero esta vez utilizando clases convencionales
        El metodo retorna un tipo de dato que es hijo del declarado en la firma.
   */
   public ClaPadre retornoCovClase(){
       ClaHija clahija= new ClaHija();
       return clahija;
   }
    public static void main(String[] args) {
        /* llamado a un metodo de una clase padre a travez de una clase hija
        utilizando covarianza.
        Notese que el metodo retornado es aquel contenido en la clase padre
        aunque en la subclase ClaHija se haya agregado un metodo -metClaseHija()-
        esto implica que el tipo retornado es el explicitado en la firma del metodo
        */
        Covariante cov=new Covariante();
        cov.retornoCovClase().ClaPadre();
        
    }
}
