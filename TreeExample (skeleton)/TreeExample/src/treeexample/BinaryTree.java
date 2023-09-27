/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package treeexample;

import java.util.*;

/**
 *
 * @author Hamilton1
 */
public class BinaryTree {

    public BTNode theRoot;

    /**
     * Creates a new instance of the BinaryTree
     */
    public BinaryTree() {
        theRoot = null;
    }

    //return the root of the tree
    public BTNode root() {
        return theRoot;
    }

    //check if the tree is empty
    public boolean isEmpty() {
        if (theRoot == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertNode(BTNode inStartNode, BTNode inNewNode) {
        // if the tree is empty, the inNewNode becames the root of the tree
        if (theRoot == null) {
            theRoot = inNewNode;
        } else { //find the location and insert the inNewNode in the non-empty tree
            if (inNewNode.getElement() > inStartNode.getElement()) {
                //insert the inNewNode on the right side of the startNode
                if (inStartNode.getRight() == null) {
                    //the startNode has no right child, so the inNewNode will become the right child
                    inStartNode.setRight(inNewNode);
                } else {
                    //the startNode has a right child / right side sub-tree, so insert the inNewNode in the right side sub-tree
                    //using a recursion
                    insertNode(inStartNode.getRight(), inNewNode);
                }
            } else if (inNewNode.getElement() < inStartNode.getElement()) {
                //insert the inNewNode on the left side of the startNode           
                if (inStartNode.getLeft() == null) {
                    //the startNode has no left child, so the inNewNode will become the left child
                    inStartNode.setLeft(inNewNode);
                } else {
                    //the startNode has a left child / left side sub-tree, so insert the inNewNode in the left side sub-tree
                    //using a recursion
                    insertNode(inStartNode.getLeft(), inNewNode);
                }
            } else if (inNewNode.getElement() == inStartNode.getElement()) {
                System.out.println("The node " + inStartNode.getElement() + " was already inserted");
            }
        }
    }

    //search and find the node that contains the given element. It returns the node that has that element
    public BTNode search(int iInSearchElement, BTNode inStartNode) {
        if (inStartNode == null) {
            return null;
        } else {
            if (iInSearchElement == inStartNode.getElement()) {
                return inStartNode;
            } else if (iInSearchElement < inStartNode.getElement()) {
                return search(iInSearchElement, inStartNode.getLeft());
            } else {
                return search(iInSearchElement, inStartNode.getRight());
            }
        }
    }

    //in-order traversal is used to parse and print all the nodes of the tree
    public void inOrderTraversal(BTNode inStartNode) {
        if (inStartNode == null) {
            return;
        } else {
            //left object
            inOrderTraversal(inStartNode.getLeft());
            //root object
            System.out.println("Node: " + inStartNode.getElement());
            //right object
            inOrderTraversal(inStartNode.getRight());
        }
    }

    //pre-order traversal is used to parse and print all the nodes of the tree
    public void preOrderTraversal(BTNode inStartNode) {
        if (inStartNode == null) {
            return;
        } else {
            //root, left, right
            System.out.println("Node: " + inStartNode.getElement());
            preOrderTraversal(inStartNode.getLeft());
            preOrderTraversal(inStartNode.getRight());
        }
    }

    //post-order traversal is used to parse and print all the nodes of the tree
    public void postOrderTraversal(BTNode inStartNode) {
        //add your code here
        if (inStartNode == null) {
            return;
        } else {
            //left, right, root
            preOrderTraversal(inStartNode.getLeft());
            preOrderTraversal(inStartNode.getRight());
            System.out.println("Node: " + inStartNode.getElement());
        }
        
    }

    //counts the number of nodes in the BinaryTree
    public int countNodes(BTNode inStartNode) {
        if (inStartNode == null) {
            return 0;
        }else{
            return (1 + countNodes(inStartNode.getLeft()) + countNodes(inStartNode.getRight()));
        }
    }

    //determines the height of a tree
    public int height(BTNode inStartNode) {
        if (inStartNode == null || inStartNode.isExternal()) {
            return 0;
        }else{
            int hleft = height(inStartNode.getLeft());
            int hright = height(inStartNode.getRight());
            return 1 + Math.max(hleft, hright);
        }
    }
}
