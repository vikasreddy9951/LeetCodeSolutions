package BinaryTreeProblems;

import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(){
        Scanner sc = new Scanner(System.in);
        root=createTree(sc);
    }

    private Node createTree(Scanner sc){
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node n = new Node(data);
        System.out.println("Creating left child of " + data);
        n.left = createTree(sc);
        System.out.println("Creating right child of " + data);
        n.right = createTree(sc);
        return n;
    }

    public void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.inorderTraversal(bt.root);
    }
}
