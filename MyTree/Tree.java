package MyTree;

public class Tree {
    Node root;
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            System.out.println(data + " Inserted at root node");
        } else {
            insert(root, data);
        }
    }
    public void insert(Node node, int data) {
        if (node.left != null) {
            insert(node.left, data);
        } else if (node.left == null) {
            System.out.println(data + " Inserted at left of parent " + node.data);
            node.left = new Node(data);
        }
        else if (node.right != null) {
            insert(node.right, data);
        } else {
            System.out.println(data + " Inserted at right of parent " + node.data);
            node.right = new Node(data);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
    }
}