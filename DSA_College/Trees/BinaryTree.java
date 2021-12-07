package DSA_College.Trees;

import java.util.Stack;

class TreeNode {
    int data;
    TreeNode right;
    TreeNode left;
}

public class BinaryTree {
    // preeOrder using iteration
    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            System.out.print(t.data +  " ");
            if (t.right != null) {
                stack.push(t.right);
            }
            if (t.left != null) {
                stack.push(t.left);
            }
        }
    }

    // inOrder using Recursion
    public void inOrder(TreeNode root) {
        589
    }
}
