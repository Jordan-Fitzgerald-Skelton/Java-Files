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
public class TreeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BTNode theNode1 = new BTNode(50);
        BTNode theNode2 = new BTNode(25);
        BTNode theNode3 = new BTNode(75);
        BTNode theNode4 = new BTNode(12);
        BTNode theNode5 = new BTNode(30);
        BTNode theNode6 = new BTNode(60);
        BTNode theNode7 = new BTNode(80);
        BTNode theNode8 = new BTNode(26);
        /*
        BTNode theNode9 = new BTNode(29);
        BTNode theNode10 = new BTNode(51);
        BTNode theNode11 = new BTNode(52);
        BTNode theNode12 = new BTNode(76);
        BTNode theNode13 = new BTNode(77);
        BTNode theNode14 = new BTNode(73);
        BTNode theNode15 = new BTNode(18);
        BTNode theNode16 = new BTNode(1003);
        BTNode theNode17 = new BTNode(9111);
        BTNode theNode18 = new BTNode(11);
        BTNode theNode19 = new BTNode(124);
        BTNode theNode20 = new BTNode(999);
        BTNode theNode21 = new BTNode(2100);
        BTNode theNode22 = new BTNode(12);
        BTNode theNode23 = new BTNode(55);
        BTNode theNode24 = new BTNode(861);
        BTNode theNode25 = new BTNode(21);
        BTNode theNode26 = new BTNode(184);
        BTNode theNode27 = new BTNode(1299);
        BTNode theNode28 = new BTNode(1211);
        */
        //create the binary tree and insert(add) the nodes created above
        BinaryTree myBinarySearchTree = new BinaryTree();
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode1);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode2);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode3);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode4);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode5);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode6);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode7);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode8);
        /*
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode9);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode10);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode11);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode12);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode13);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode14);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode15);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode16);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode17);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode18);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode19);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode20);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode21);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode22);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode23);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode24);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode25);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode26);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode27);
        myBinarySearchTree.insertNode(myBinarySearchTree.theRoot, theNode28);
        */
        System.out.println("The nodes were added to the list");
        System.out.println("***********************");
        
        System.out.println("In-order Traversal - listing the nodes:");
        myBinarySearchTree.inOrderTraversal(myBinarySearchTree.theRoot);
        System.out.println("***********************");
        
        BTNode foundNode = myBinarySearchTree.search(theNode5.getElement(), myBinarySearchTree.root());
        if (foundNode == null) {
            System.out.println("The node " + theNode5.getElement() + " DOES NOT exist in the tree!");
        } else {
            System.out.println("The node " + theNode5.getElement() + " exists in the tree!");
        }
        System.out.println("***********************");

        System.out.println("Pre-order Traversal - listing the nodes:");
        myBinarySearchTree.preOrderTraversal(myBinarySearchTree.theRoot);
        System.out.println("***********************");

        System.out.println("Post-order Traversal - listing the nodes:");
        myBinarySearchTree.postOrderTraversal(myBinarySearchTree.theRoot);
        System.out.println("***********************");

        System.out.println("No. of nodes is " + myBinarySearchTree.countNodes(myBinarySearchTree.theRoot));
        System.out.println("***********************");

        System.out.println("The height of the tree is " + myBinarySearchTree.height(myBinarySearchTree.theRoot));
        System.out.println("***********************");

        //find the height of theNode2 that has the value 25
        BTNode node = myBinarySearchTree.search(theNode2.getElement(), myBinarySearchTree.root());
        System.out.println("The height of the node with the value 25 is " + myBinarySearchTree.height(node));
    }
}