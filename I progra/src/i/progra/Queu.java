/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i.progra;

/**
 *
 * @author Kevin Matamoros
 */
public class Queu {
        
    public Nodo front;
    public Nodo rear;
    public Nodo current;
    public int size;
    public int pos;
    
    public Queu(){
        front = new Nodo();
        current=front;
        rear = current;
        size=0;        
    }
    public void Enqueu(Object element){
        if (size==0){
            Nodo newN = new Nodo(element);
            front.setNext(newN);
            System.out.println(newN.getElemento());
            rear=newN;
            size++;
        }
        else{
            Nodo newN = new Nodo(element);
            rear.setNext(newN);
            System.out.println(newN.getElemento());
            rear=newN;
            size++;
        }
        
        
    }
    public void Dequeu(){
        if (size==0){
            System.out.println("Cola se encuentra vacia");
        }
        else{      
            System.out.println(front.getElemento());
            front=front.getNext();
            size--;
        }
    }
    public void first(){
        if(front.getElemento()==null){
            System.out.println(front.getNext().getElemento());
        }
        else{
            System.out.println(front.getElemento());
        }
    
    }
    public int size(){
        return size;
    }
    @SuppressWarnings("empty-statement")
    public String toString(){
        Nodo temp=front;
        String Datos = "";
        for(int c=0 ;c<size;c++){
            if (front==null){
                Datos+=String.valueOf(temp.getNext().getElemento());
                temp=temp.getNext();
            }
            else{
                Datos+=String.valueOf(temp.getNext().getElemento());
                temp=temp.getNext();
            }
        }
        System.out.println(Datos);
        return Datos;
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Queu asdf= new Queu();
    asdf.Enqueu(1);
    asdf.Enqueu(2);
    asdf.Enqueu(3);
    asdf.Enqueu(4);
    asdf.Enqueu(5);
    asdf.first();
    System.out.println("\n"); 
    asdf.Dequeu();
    asdf.first(); 
    System.out.println("\n"); 
    asdf.toString();
    
    }
    
    
}
