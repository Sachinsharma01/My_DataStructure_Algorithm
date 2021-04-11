package MyTree;

class Tree {
    Node root;
    Node n = root;
    public void insert(int data) {
        root = insert(root, data);
    }
    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else {
            // value already exists
            return node;
        }

        return node;
    }
    public void print(){print(root);}
    private void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.println(" " + node.data);
            print(node.right);
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
        tree.print();
    }
}