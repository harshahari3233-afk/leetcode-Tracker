// Last updated: 7/9/2026, 3:11:10 PM
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode nx=null;
        for(int i=0;i<right-left;i++){
            nx=curr.next;
            curr.next=nx.next;
            nx.next=prev.next;
            prev.next=nx;
        }
        return dummy.next;

    }
}