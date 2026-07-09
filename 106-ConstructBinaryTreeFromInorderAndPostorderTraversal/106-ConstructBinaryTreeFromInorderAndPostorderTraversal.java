// Last updated: 7/9/2026, 3:10:57 PM
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
    private Map<Integer,Integer>map=new HashMap<>();
    private int ind;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len=postorder.length;
        ind=len-1;
        for(int i=0;i<len;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0,len-1);
    }
    public TreeNode build(int[] postorder,int l,int r){
        if(l>r){
            return null;
        }
        int val=postorder[ind--];
        TreeNode root=new TreeNode(val);
        int mid=map.get(val);
        root.right=build(postorder,mid+1,r);
        root.left=build(postorder,l,mid-1);
        return root;
        
    }
}