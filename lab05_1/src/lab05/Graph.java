/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aelittaezugbaa
 */
public class Graph {

    private ArrayList<Node> graph;
    private int index;

    public Graph() {
        this.graph = new ArrayList<Node>();
        this.index = 0;
    }

    /* tell how many nodes a graph has */
    public int nodes() {
        int nodes = 0;
        nodes = this.graph.size();
        return nodes;
    }

    /* read a graph from the file */
    public boolean readGraph(File file) throws FileNotFoundException {
        boolean read = false;
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String sr = scan.nextLine();
            String[] num = sr.split(" ");
            int key = Integer.parseInt(num[0]);
            Node node = new Node(key);
            Node cur = node;
            for (int i = 1; i < num.length; i++) {
                Node next = new Node(Integer.parseInt(num[i]));
                cur.setNext(next);
                cur = cur.getNext();
            }
            this.graph.add(node);
        }
        scan.close();
        read = true;
        return read;
    }

    /* print a graph */
    public void printGraph() {
        int length = this.graph.size();
        for (int i = 0; i < length; i++) {
            Node node = this.graph.get(i);
            System.out.print(node.getValue() + ": ");
            while (node.getNext() != null) {
                System.out.print(node.getNext().getValue() + " ");
                node = node.getNext();
            }
            System.out.println("");
        }

    }

    /* Depth First Search
 * start is the node from where the search begins
 * visited is an array of all the visited nodes
 * pred is an describing the search path
     */
    public void dfs(int start, boolean[] visited, int[] pred) {
          Node node;
          visited[start]=true;
          node= this.graph.get(start).getNext();
          
          while( node!=null){
              if(!visited[node.getValue()]){
                  int i = node.getValue();
                  pred[i]=start;
                  dfs(i,visited,pred);
              }
              node= node.getNext();
          }
//          System.out.println(Arrays.toString(pred));
    }

}
