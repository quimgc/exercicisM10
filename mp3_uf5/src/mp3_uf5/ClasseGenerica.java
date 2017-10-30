/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_uf5;

/**
 *
 * @author quim
 */
public class ClasseGenerica<E> {
    
    
    private E element;
    
    public ClasseGenerica(E element){
        this.element = element;
    }
    
    
    public void setElement(E element){
        this.element = element;
    }
    
    public E getElement(){
        return this.element;
    }
    
    
    
    
}
