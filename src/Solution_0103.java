/**
 * 0103. Binary Tree Zigzag Level Order Traversal
 * Difficulty : Medium
 */

//------------------------------------

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

public class Solution_0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        deque.add(root);
        while(!deque.isEmpty()) {
            List<Integer> current = new LinkedList<>();
            int n = deque.size();
            for(int i=0; i<n; i++) {
                TreeNode node = deque.removeFirst();
                if(list.size() % 2 == 0) {
                    current.add(node.val);
                }
                else {
                    current.add(0, node.val);
                }
                if(node.left != null) {
                    deque.add(node.left);
                }
                if(node.right != null) {
                    deque.add(node.right);
                }
            }
            list.add(current);
        }
        return list;
    }
}
