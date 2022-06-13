import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class treesize {

    static Node insert(Node root, int data){
        Node temp = new Node(data);
        if(root==null)
            return temp;
        else if(data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    static void print(Node root){
        if(root==null)
            return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    static int sizeOfTree(Node root){
        if(root==null)
            return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            root = insert(root,sc.nextInt());
        }
        print(root);
        System.out.println(" ");
        int size = sizeOfTree(root);
        System.out.println("Size of tree is: " + size);
    }
}
