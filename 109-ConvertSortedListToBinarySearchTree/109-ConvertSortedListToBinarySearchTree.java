// Last updated: 7/9/2026, 3:10:52 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            TreeNode root=new TreeNode(head.val);
            return root;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null ){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        TreeNode root=new TreeNode(slow.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return root;
    }
}