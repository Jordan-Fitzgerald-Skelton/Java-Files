/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sllexample;

/**
 *
 * @author Hamilton1
 */
public interface LinearListInterface {

    public boolean isEmpty();

    public int size();

    public Object get(int iIndex);

    public void remove(int iIndex);

    public void add(int iIndex, Object element);

    public void add(Object element);

    public void printList();
}
