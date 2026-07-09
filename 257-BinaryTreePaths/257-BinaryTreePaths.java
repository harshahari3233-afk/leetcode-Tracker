// Last updated: 7/9/2026, 3:09:07 PM
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        String s="";
        d(root,l,s);
        return l;
    }
    public void d(TreeNode root,List<String> l,String s){
        if(root==null){
            return ;
        }
        s+=root.val;
        if(root.left==null && root.right==null){
        l.add(s);
        return ;
        }
        s+="->";
        d(root.left,l,s);
        d(root.right,l,s);
    }
}