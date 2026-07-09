// Last updated: 7/9/2026, 3:10:49 PM
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            int rl=minDepth(root.right);
            int depth=rl+1;
            return depth;
        }
        if(root.right==null){
            int ln=minDepth(root.left);
            int depth=ln+1;
            return depth;
        }
        
        int ln=minDepth(root.left);
        int rl=minDepth(root.right);
        int depth=Math.min(ln,rl);
        return 1+depth;
        }
}