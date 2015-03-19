/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.progra;

import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author Kevin Matamoros
 */
public class Nodo <E> {
    private Nodo left;
    private Nodo right;
    private E valor;
    private boolean isleaft;
    private Object nodo;
    public boolean isleaf(){
        if(this.right==null && this.left == null){
        return false;
        }
        return false;
    }
    
    
    public boolean isroot(){return false;
}
    //public void setroot(boolean E.isroot()){}
    public void add(){
        
    }
    
}
