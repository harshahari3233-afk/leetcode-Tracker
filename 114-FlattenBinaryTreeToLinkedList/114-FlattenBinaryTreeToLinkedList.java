// Last updated: 7/9/2026, 3:10:44 PM
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
class Solution {
      private TreeNode prev = null;

    public void flatten(TreeNode root) {
        dfs(root);
    }
    public void dfs(TreeNode node){
        if(node==null){
            return;
        }
            dfs(node.right);
            dfs(node.left);
            node.right=prev;
            node.left=null;
            prev=node;
    }
}