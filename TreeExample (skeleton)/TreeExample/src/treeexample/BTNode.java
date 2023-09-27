/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treeexample;

/**
 *
 * @author Hamilton1
 */
public class BTNode {

    private int element;
    private BTNode leftChild;
    private BTNode rightChild;

    /**
     * Creates a new instance of BTNode
     */
    public BTNode(int iInValue) {
        element = iInValue;
        leftChild = null;
        rightChild = null;
    }

    public boolean isLeaf() {
        return ((leftChild == null) && (rightChild == null));
    }

    public int getElement() {
        return element;
    }

    public void setLeft(BTNode inNode) {
        leftChild = inNode;
    }

    public void setRight(BTNode inNode) {
        rightChild = inNode;
    }

    public BTNode getLeft() {
        return leftChild;
    }

    public BTNode getRight() {
        return rightChild;
    }

    public boolean isInternal() {
        if ((leftChild != null) || (rightChild != null)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isExternal() {
        if ((leftChild == null) && (rightChild == null)) {
            return true;
        } else {
            return false;
        }
    }
}