/**
 * 0783. Minimum Distance Between BST Nodes
 * Difficulty : Easy
 */

//--------------------------------------------

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution_0783 {
    Integer prev = null;
    int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root == null) {
            return -1;
        }
        inOrder(root);
        return res;
    }

//Inorder Traversal
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(prev == null) {
            prev = root.val;
        }
        else {
            int diff = root.val - prev;
            res = Math.min(diff, res);
            prev = root.val;
        }
        inOrder(root.right);
    }
}
