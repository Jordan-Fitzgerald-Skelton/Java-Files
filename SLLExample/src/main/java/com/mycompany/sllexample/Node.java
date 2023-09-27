/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sllexample;

/**
 *
 * @author Hamilton1
 */
public class Node {

    private Object element;
    private Node next;

    public Node(Object inElement, Node inNode) {
        element = inElement;
        next = inNode;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node inNode) {
        next = inNode;
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
