// Last updated: 7/9/2026, 3:10:46 PM
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
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> r=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        int s=0;
        d(root,r,s,t,l);
        return r;
    }
    public void d(TreeNode root,List<List<Integer>> r,int s,int t,List<Integer> l){
        if(root==null){
            return ;
        }
        l.add(root.val);
        s+=root.val;
        if(root.left==null && root.right==null){
            if(s==t){
                r.add(new ArrayList<>(l));
            }
        }
        else{
        d(root.left,r,s,t,l);
        d(root.right,r,s,t,l);
        }
        l.remove(l.size()-1);
    }
}