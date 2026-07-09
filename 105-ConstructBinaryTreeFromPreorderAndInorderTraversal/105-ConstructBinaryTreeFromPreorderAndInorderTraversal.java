// Last updated: 7/9/2026, 3:10:59 PM
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
    private int ind=0;
    private Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int l,int r){
        if(l>r){
            return null;
        }
        int rval=preorder[ind++];
        TreeNode root=new TreeNode(rval);
        int mid=map.get(rval);
        root.left=build(preorder,l,mid-1);
        root.right=build(preorder,mid+1,r);
        return root;

    }
}