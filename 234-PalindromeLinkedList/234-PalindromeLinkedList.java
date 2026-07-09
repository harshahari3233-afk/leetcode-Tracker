// Last updated: 7/9/2026, 3:09:17 PM
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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode cur=slow;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        boolean t=true;
        ListNode f=head;
        ListNode s=prev;
        while(s!=null){
            if(s.val!=f.val){
                t=false;
                break;
            }
            f=f.next;
            s=s.next;
        }
        return t;
    }
}