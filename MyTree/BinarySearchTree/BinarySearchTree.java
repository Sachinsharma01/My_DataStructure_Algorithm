package MyTree.BinarySearchTree;

public class BinarySearchTree {

    public void insert(Node node, int value) {
        if (value < node.data) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left of " + node.data);
                node.left = new Node(value);
            }
        } else if (value > node.data) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right of " + node.data);
                node.right = new Node(value);
            }
        }
    }
    public Node search(Node node, int data) {
        if (node == null)
            return null;
        else if (node.data == data)
            return node;
        else if (node.data < data)
            return search(node.left, data);
        else
            return search(node.right, data);
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public int maxHeight(Node node) {
        if (node == null)
            return 0;
        else {
            int rightHeight = maxHeight(node.right);
            int leftNode = maxHeight(node.left);

            return (Math.max(rightHeight, leftNode) + 1);
        }
    }

    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(5);
        // tree having root node vale = 5
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);

        System.out.println("InOrder");
        tree.traverseInOrder(root);
        System.out.println("\nPostOrder");
        tree.traversePostOrder(root);
        System.out.println("\nPreOrder");
        tree.traversePreOrder(root);

        System.out.println("\nMaximum Height : " + tree.maxHeight(root));

        System.out.println("Data : " + tree.search(root, 4).data);

    }
}