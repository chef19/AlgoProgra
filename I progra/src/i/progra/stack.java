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
            System.out.println("Pila vacia");
        }
        Object retornar =top.getElemento();
        top=top.getNext();
        size--;
        System.out.println(retornar);
    }
    
    public void getTop(){
        if(size==0){
            System.out.println("Pila vacia");
        }
        else{
            System.out.println(top.getElemento());
        }
    }
    
    public void getSize(){
        System.out.println(size);
    }
    
    public void isEmpty(){
        if(top==null && size==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
    
    public void clear(){
        top=null;
        size=0;
    }
    
    
    
    public static void main(String args[]){
        stack a=new stack();
        a.push(335);
        a.push(336);
        a.push(337);
        a.pop();
        a.getTop();
        a.getSize();
        a.push(5);
        a.getSize();
        a.push(43);
        a.push(59);
        a.pop();
        a.pop();
        a.getSize();
        a.getTop();
        a.clear();
        a.isEmpty();
        a.getTop();
        a.push(7);
        a.getTop();
        a.isEmpty();
        a.pop();
        a.getTop();
        
    }
    
}
