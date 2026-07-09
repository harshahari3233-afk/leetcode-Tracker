// Last updated: 7/9/2026, 3:09:15 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return r(root,p,q);
    }
    public TreeNode r(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
         if(root==p || root==q){
            return root;
        }
        TreeNode l=r(root.left,p,q);
        TreeNode rr=r(root.right,p,q);
        if(l!=null && rr!=null){
            return root;
        }
        return (l!=null)?l:rr;
    }
}