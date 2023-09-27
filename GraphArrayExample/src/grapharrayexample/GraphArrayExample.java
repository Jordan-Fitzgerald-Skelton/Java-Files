/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapharrayexample;

/**
 *
 * @author Hamilton1
 */
import java.util.*;

public class GraphArrayExample {
    // Simple graph representation as Adjacency List
    public ArrayList<ArrayList<Integer>> adjacencyList;
    public int iNumberOfVertices;

    public GraphArrayExample(int iInNumberOfVertices) {
        this.iNumberOfVertices = iInNumberOfVertices;
        adjacencyList = new ArrayList<ArrayList<Integer>>();

        for (int iCount = 0; iCount < iInNumberOfVertices; iCount++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Adds an edge between two nodes in the graph representation (data structure)
    void addEdge(int iNode1, int iNode2) {
        adjacencyList.get(iNode1).add(iNode2);
        adjacencyList.get(iNode2).add(iNode1);
    }

    // Removes an edge between two nodes
    void removeEdge(int iNode1, int iNode2) {
        adjacencyList.get(iNode1).remove(Integer.valueOf(iNode2));
        adjacencyList.get(iNode2).remove(Integer.valueOf(iNode1));
    }

    // Prints the adjacency list representation of the graph
    void printGraph() {
        for (int iCount = 0; iCount < adjacencyList.size(); iCount++) {
            System.out.println("\nAdjacency list of vertex (node) " + iCount);
            for (int jCount = 0; jCount < adjacencyList.get(iCount).size(); jCount++) {
                System.out.print("  " + adjacencyList.get(iCount).get(jCount));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        GraphArrayExample myGraph = new GraphArrayExample(5);

        // Adding edges one by one
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 4);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 3);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 4);

        myGraph.printGraph();

        // Remove the edge between node 4 and node 1
        myGraph.removeEdge(1, 4);
        System.out.println("\nPrinting the adjacency list of the Graph after the edge between Node 4 and Node 1 was removed...");
        myGraph.printGraph();
    }
}
