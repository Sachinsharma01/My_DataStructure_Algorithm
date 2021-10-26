package Leetcode;


//class Leetcode_112 {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null)
//            return false;
//        if (root.left == null && root.right == null)
//            return root.val - targetSum == 0;
//        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
//    }
//}