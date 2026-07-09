// Last updated: 7/9/2026, 3:11:55 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode c=dummy;
        while(true){
            ListNode kt=c;
            for(int i=0;i<k;i++){
                kt=kt.next;
                if(kt==null){
                    return dummy.next;
                }
            }
            ListNode gr=kt.next;
            ListNode prev=gr;
            ListNode cur=c.next;
            while(cur!=gr){
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            ListNode temp=c.next;
            c.next=kt;
            c=temp;

        }
    }
}