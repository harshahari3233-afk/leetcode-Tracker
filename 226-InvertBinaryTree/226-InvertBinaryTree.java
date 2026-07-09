// Last updated: 7/9/2026, 3:09:23 PM
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
    public TreeNode invertTree(TreeNode root) {
        return s(root);
    }
        public TreeNode s(TreeNode root){
            TreeNode node=root;
        if(node==null){
            return null;
        }
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        s(node.left);
        s(node.right);
        return root;
        }
    
}