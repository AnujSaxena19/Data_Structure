/*Implement a stack using singly linked list

 */

package Competitive_Programs;

import static java.lang.System.exit;
class Stack_using_SLL {

    private class Node{
        int data;
        Node link;
    }
    Node top;
    Stack_using_SLL(){
        this.top=null;
    }
    public void push(int x){

        Node temp=new Node();
        if(temp==null){
            System.out.print("Stack Overflow");
            return;
        }
        temp.data=x;
        temp.link=top;
        top=temp;
    }

    public boolean isEmpty(){
        return top==null;
    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop() // remove at the beginning
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }

    public void display()
    {
        if (top == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }
    }
}
class Stack_Using_LinkedList {
    public static void main(String[] args)
    {
        Stack_using_SLL obj = new Stack_using_SLL();

        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}