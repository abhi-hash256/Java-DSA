
import java.util.*;

class Node{
    char data;
    Node left, right;
    Node(char data){
        this.data = data;
        left = right =null;
    }
}

public class tree {   // Print data in inorder traversal ( left->root->right )
    public static void print(Node root){
        if(root == null)
            return;
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node('a');
        root.left = new Node('b');
        root.right = new Node('h');
        root.left.left = new Node('i');
        print(root);
        System.out.println(" ");
    }
}
