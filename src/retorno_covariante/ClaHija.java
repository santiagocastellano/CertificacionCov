/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retorno_covariante;

/**
 *
 * @author santi
 */
public class ClaHija extends ClaPadre {

    @Override
    public void ClaPadre() {
        super.ClaPadre(); 
        System.out.println("clase hija -retorno covariante-");
    }
    public void metClaseHija(){
        System.out.println("Metodo de la clase hija");
    }
}
