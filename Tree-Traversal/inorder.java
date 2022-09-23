#Inorder traversal of tree ( catch is if we do inorder traversal of BST we get data in sorted order )

import java.io.*;
import java.util.*;

class NodeTree{
    int data;
    NodeTree left;
    NodeTree right;

    NodeTree(int x){
        this.data = x;
        left = right = null;
    }
}

public class basics {
    static NodeTree insert(NodeTree root, int data){
        NodeTree temp = new NodeTree(data);
        if(root == null)
            return temp;
        else if(root.data>=data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    static void print(NodeTree root){
        if(root == null)
            return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public static void main(String[] args){
        NodeTree root = null;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            root = insert(root,sc.nextInt());
        }
        print(root);
    }
}
