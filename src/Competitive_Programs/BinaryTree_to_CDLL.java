/*Given a Binary Tree, convert it to a Circular Doubly Linked List (In-Place).

The left and right pointers in nodes are to be used as previous and next pointers respectively in converted Circular Linked List.
The order of nodes in List must be same as Inorder of the given Binary Tree.
The first node of Inorder traversal must be head node of the Circular List.

 */

package Competitive_Programs;

class Node{
    int val;
    Node left,right;
    public Node(int val){
        this.val=val;
        left=right=null;
    }
}

class Tree{
    Node root;
    public Tree(){
        root=null;
    }
    private Node concatenate(Node leftList,Node rightList){
        if(leftList==null){
            return rightList;
        }
        if(rightList==null){
            return leftList;
        }
        Node leftLast=leftList.left;
        Node rightLast=rightList.left;

        leftLast.right=rightList;
        rightLast.left=leftLast;

        leftList.left=rightLast;
        rightLast.right=leftList;

        return leftList;
    }

    public Node bTreeToCList(Node root){
        if(root==null){
            return null;
        }
        Node left=bTreeToCList(root.left);
        Node right=bTreeToCList(root.right);

        root.left=root.right=root;

        return concatenate(concatenate(left,root),right);
    }

    public void display(Node head){
        System.out.println("Circular Linked List is: ");
        Node itr=head;
        do{
            System.out.print(itr.val+" ");
            itr=itr.right;
        }
        while(itr!=head);
        System.out.println();
    }
}

public class BinaryTree_to_CDLL {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new Node(10);
        tree.root.left=new Node(12);
        tree.root.right =new Node(15);
        tree.root.left.left =new Node(25);
        tree.root.left.right =new Node(30);
        tree.root.right.left =new Node(36);

        Node head=tree.bTreeToCList(tree.root);
        tree.display(head);
    }
}
