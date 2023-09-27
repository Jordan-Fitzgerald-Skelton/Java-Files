/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sllexample;

/**
 *
 * @author Hamilton1
 */
//NOTE:  we count elements from position 1. First node from the list is on position 1.
public class SLList implements LinearListInterface {

    private Node head;
    private int iSize;
    private Node curNode;
    private Node prevNode;

    public SLList() {
        head = null;
        iSize = 0;
        curNode = null;
        prevNode = null;
    }

    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return iSize;
    }

    // assume the index is in the correct range
    public void add(int iPosition, Object inElement) {
        // special case of adding at the head of the list ( on the first position)
        if (iPosition == 1) {
            Node newNode = new Node(inElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            Node newNode = new Node(inElement, curNode);
            prevNode.setNext(newNode);
        }
        // as a new one was added the size counter must be increased by 1
        iSize = iSize + 1;
    }

    //add an elemenst at the end of the list (on the last position)
    public void add(Object inElement) {
        Node newNode = new Node(inElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            curNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    public Object get(int iIndex) {
        setCurrent(iIndex);
        return curNode;
    }

    public void remove(int iIndex) {
        // special case for removing the head of the list / first node.
        if (iIndex == 1) {
            head = head.getNext();
        } else {
            // find the previous and current nodes
            setCurrent(iIndex);
            prevNode.setNext(curNode.getNext());
        }
        // as one node was removed the size counter must be decreased by 1
        iSize = iSize - 1;
    }

    private void setCurrent(int iIndex) {
        // sets curNode to the node at position specified by index
        // sets prevNode to the node previous to curNode
        int iCount;
        prevNode = null;
        curNode = head;
        for (iCount = 1; iCount < iIndex; iCount++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
    }

    // printlist() method prints out the content of the list                                  
    public void printList() {
        Node aNode = head;
        while (aNode != null) {
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
    }
}