/*Given postorder traversal of a binary search tree, construct the BST.

For example, if the given traversal is {1, 7, 5, 50, 40, 10}, then following tree should be constructed and root of the tree should be returned.

     10
   /   \
  5     40
 /  \      \
1    7      50

 */

package Competitive_Programs;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class Index{
    int postindex=0;
}

public class BinaryTree {
    TreeNode constructTreeUtil(int [] post,Index postIndex,int key,int min,int max,int size){
        if(postIndex.postindex<0){
            return null;
        }
        TreeNode root=null;
        if(key>min && key<max){
            root = new TreeNode(key);
            postIndex.postindex=postIndex.postindex-1;

            if(postIndex.postindex>0){
                root.right=constructTreeUtil(post,postIndex,post[postIndex.postindex],key,max,size);

                root.left=constructTreeUtil(post,postIndex,post[postIndex.postindex],min,key,size);
            }
        }
        return root;
    }
    TreeNode constructTree(int [] post,int size){
        Index index=new Index();
        index.postindex=size-1;
        return constructTreeUtil(post, index, post[index.postindex],
                Integer.MIN_VALUE, Integer.MAX_VALUE, size);
    }

    void printInorder(TreeNode node){
        if(node==null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        int n=sc.nextInt();
        int [] post=new int[n];
        for(int i=0;i<n;i++){
            post[i]=sc.nextInt();
        }

        TreeNode root=tree.constructTree(post,n);
        System.out.println("Inorder traversal of the constructed tree:");
        tree.printInorder(root);

    }
}
