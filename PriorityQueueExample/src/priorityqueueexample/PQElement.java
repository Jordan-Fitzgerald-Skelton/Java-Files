/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexample;

/**
 *
 * @author Hamilton1
 */
//The class defines the format of one item/element from the priroty queue
//Each element has the object with the information to be stored and the iKey/priority assigned to that object
public class PQElement {

    private int iKey;
    private Object element;

    public PQElement(int iInPriority, Object inElement) {
        iKey = iInPriority;
        element = inElement;
    }

    public int getiKey() {
        return iKey;
    }

    public void setiKey(int iInPriority) {
        iKey = iInPriority;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        element = inElement;
    }

    public String toString() {
        return element.toString();
    }
}