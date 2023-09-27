/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexample;

/**
 *
 * @author Hamilton1
 */
public interface PQInterface {

    public void enqueue(int iKey, Object element);

    public int size();

    public boolean isEmpty();

    public Object dequeue();

    public String printPQueue();
}
