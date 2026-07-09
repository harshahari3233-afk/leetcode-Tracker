// Last updated: 7/9/2026, 3:11:05 PM
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
    public boolean isSymmetric(TreeNode root) {
        return s(root.left,root.right);
    }
        public boolean s(TreeNode t1,TreeNode t2){

            if(t1==null && t2==null){
                return true;
            }
            if(t1==null || t2==null){
                return false;
            }
            
            return (t1.val==t2.val && s(t1.left,t2.right) && s(t1.right,t2.left));
        }
            
        }