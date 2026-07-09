// Last updated: 7/9/2026, 3:10:55 PM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        dfs(root,0,l);
        Collections.reverse(l);
        return l;
    }
    public void dfs(TreeNode node,int i,List<List<Integer>> l){
        if(node==null){
            return ;
        }
        if(l.size()==i){
            l.add(new ArrayList<>());
        }
        l.get(i).add(node.val);
        dfs(node.left,i+1,l);
           dfs(node.right,i+1,l);
        
        
       
    }
}