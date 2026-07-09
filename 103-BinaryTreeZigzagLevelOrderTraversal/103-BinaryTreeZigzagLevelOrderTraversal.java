// Last updated: 7/9/2026, 3:11:02 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> r=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        boolean b=true;
        if(root==null){
            return r;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(b){
                l.add(node.val);
                }
                else{
                    l.add(0,node.val);
                }
            
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            r.add(l);
            b=!b;
        }
        return r;
    }
}