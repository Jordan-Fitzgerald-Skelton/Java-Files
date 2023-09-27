/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinkedlistapp;

/**
 *
 * @author Hamilton1
 */
public class DlNode {
        private Object element;
	private DlNode next;
	private DlNode prev;

    public DlNode(Object inElement, DlNode inNext, DlNode inPrevious){
	element = inElement;
	next = inNext;
        prev = inPrevious;
    }
    public DlNode getNext() {
	return next;
    }
    public void setNext(DlNode inNext) {
	next = inNext;
    }
    public DlNode getPrev() {
	return prev;
    }
    public void setPrev(DlNode inPrevious) {
	prev = inPrevious;
    }
    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
	inElement = inElement;
    }

}
