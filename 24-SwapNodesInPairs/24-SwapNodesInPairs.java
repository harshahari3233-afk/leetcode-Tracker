// Last updated: 7/9/2026, 3:11:56 PM
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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pg=dummy;
        while(true){
            ListNode kth=pg;
            for(int i=0;i<2;i++){
                kth=kth.next;
                if(kth==null){
                    return dummy.next;
                }
            }
            ListNode eg=kth.next;
            ListNode prev=eg;
            ListNode cur=pg.next;
            while(cur!=eg){
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            pg.next=kth;
            pg=pg.next.next;
        }
    }
}