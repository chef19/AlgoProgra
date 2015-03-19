/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.progra;

/**
 *
 * @author Ricardo Araya
 */
public class stack {
    public Nodo top;
    public int size;
    
    
    
    public stack(){
        this.top=null;
        this.size=0;
    }
    
    public void push(Object elemento){
        top=new Nodo(elemento,top);
        size++;
        System.out.println(elemento);
    }
    
    public void pop(){
        if(top==null || size==0){
            System.out.println("Esta vacia");
        }
        size--;
        System.out.println(top);
    }
    
    
    
    
    public static void main(String args[]){
        stack a=new stack();
        a.push(335);
        a.push(336);
        a.push(337);
        a.pop();
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
