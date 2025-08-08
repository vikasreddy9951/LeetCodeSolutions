package BinaryTreeProblems;

import java.util.Scanner;

public class bts {
    Node root;

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left = right = null;
        }
    }
    bts(){
        Scanner sc = new Scanner(System.in);
        root=createNodes(sc);
    }
    public Node createNodes(Scanner sc){
        int n = sc.nextInt();
        if(n==-1){
            return null;
        }
        Node nn = new Node(sc.nextInt());
        System.out.println("Creating left child of " + nn);
        nn.left=createNodes(sc);
        System.out.println("Creating right child of " + nn);
        nn.right=createNodes(sc);
        return nn;
    }
}
