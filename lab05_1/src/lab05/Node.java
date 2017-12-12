/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author aelittaezugbaa
 */
public class Node {
    private int val;
    private Node next;
    
    public Node(int value){
        this.next=null;
        this.val=value;
    }
    
    public int getValue(){
        return this.val;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node next){
        this.next=next;
    }
    
}
