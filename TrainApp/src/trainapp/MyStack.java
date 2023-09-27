/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trainapp;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class MyStack implements StackInterface {

    private ArrayList<String> theStack;

    /**
     * Creates a new instance of Stack
     */
    public MyStack() {
        theStack = new ArrayList<String>();
    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the TOP (first position) of the stack and returns
     * it
     */
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts/inserts an item onto the TOP (first position) of the stack
     */
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);
    }

    public int size() {
        return theStack.size();
    }
    
    public void empytStack() {
        while(!(theStack.isEmpty())){
            pop();
        }
    }
    
    public String displayStack() {
        int count;
        String sMessage = new String();
        if(theStack.isEmpty()){
            sMessage = sMessage.concat("The Stack is empty");
        }else{
            for(count = 0; count < theStack.size(); count ++){
                sMessage = sMessage.concat(theStack.get(count));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }
}
