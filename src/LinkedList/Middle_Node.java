package LinkedList;

import java.util.Scanner;

public class Middle_Node {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private void printMiddle(){
        Node sl_ptr=head;
        Node ft_ptr=head;
        if(head!=null){
            while(ft_ptr!=null && ft_ptr.next!=null){
                ft_ptr=ft_ptr.next.next;
                sl_ptr=sl_ptr.next;
            }
            System.out.println("Middle element is "+sl_ptr.data);
        }
    }
    private void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    private void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("null");
    }
    public static void main(String []args){
        Middle_Node linkedlist=new Middle_Node();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the linked list");
        int n=sc.nextInt();
        for(int i=n;i>0;i--) {
            linkedlist.push(i);
        }
            linkedlist.printList();
            linkedlist.printMiddle();


    }


}
