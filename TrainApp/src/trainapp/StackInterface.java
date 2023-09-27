/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trainapp;

/**
 *
 * @author Jordan
 */
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();
    
    //add
    public void push(Object newItem);
    
    //remove
    public Object pop();
    
    //size
    public int size();
    
    public void empytStack();
    
    public String displayStack();

}
