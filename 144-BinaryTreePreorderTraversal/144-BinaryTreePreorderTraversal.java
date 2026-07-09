// Last updated: 7/9/2026, 3:10:29 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        dfs(root,l1);
        return l1;
    }
    public void dfs(TreeNode root,List<Integer> l1){
        if(root==null){
            return ;
        }
        else{
            l1.add(root.val);
            dfs(root.left,l1);
            dfs(root.right,l1);
        }
    }
}