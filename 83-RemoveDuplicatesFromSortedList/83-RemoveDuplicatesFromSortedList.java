// Last updated: 7/9/2026, 3:11:15 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        Set<Integer> set=new HashSet<>();
            ListNode prev=head;
            ListNode cur=prev.next;
            set.add(prev.val);
            while(prev!=null && cur!=null){
                    if(!set.add(cur.val)){
                        prev.next=cur.next;
                        cur=prev.next;

                    }
                else{
                prev=cur;
                cur=cur.next;
                }
            }
        
        return head;
    }
}