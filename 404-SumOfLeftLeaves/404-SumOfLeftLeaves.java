// Last updated: 7/9/2026, 3:08:32 PM
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.left.right==null && root.left.left==null){
    sum+=root.left.val;
        }
                sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);


    return sum;
    }
}