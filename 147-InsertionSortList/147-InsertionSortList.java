// Last updated: 7/9/2026, 3:10:26 PM
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=head;
        ListNode cur=prev.next;
        while(cur!=null){
            if(cur.val<prev.val){
                ListNode pos=dummy;
                while(pos.next!=null && pos.next.val<cur.val){
                    pos=pos.next;
                }
                prev.next=cur.next;
                cur.next=pos.next;
                pos.next=cur;
                cur=prev.next;
            }
            else{
        
                prev=prev.next;
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}