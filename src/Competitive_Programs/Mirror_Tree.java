/*Given a binary tree, the task is to create a new binary tree which is a mirror image of the given binary tree.

Examples:

Input:
        5
       / \
      3   6
     / \
    2   4
Output:
Inorder of original tree: 2 3 4 5 6
Inorder of mirror tree: 6 5 4 3 2
Mirror tree will be:
  5
 / \
6   3
   / \
  4   2

Input:
        2
       / \
      1   8
     /     \
    12      9
Output:
Inorder of original tree: 12 1 2 8 9
Inorder of mirror tree: 9 8 2 1 12

 */

package Competitive_Programs;

public class Mirror_Tree {
    static class node{
        int val;
        node left;
        node right;
    }

   private static node createNode(int val){
        node newNode=new node();
        newNode.val=val;
        newNode.left=null;
        newNode.right=null;
        return  newNode;
    }

   private static void inorder(node root){
        if(root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    private static node mirrorify(node root){
        if(root==null){
            return null;
        }
        node mirror=createNode(root.val);
        mirror.right=mirrorify(root.left);
        mirror.left=mirrorify(root.right);

        return mirror;
    }

    public static void main(String[] args) {
        node tree=createNode(5);
        tree.left=createNode(3);
        tree.right=createNode(6);
        tree.left.left=createNode(2);
        tree.left.right=createNode(4);

        System.out.print("Inorder of original Tree:");
        inorder(tree);
        node mirror;
        mirror=mirrorify(tree);

        System.out.print("\n Inorder of mirror Tree:");
        inorder(mirror);
    }
}
