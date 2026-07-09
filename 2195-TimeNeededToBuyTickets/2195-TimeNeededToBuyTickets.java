// Last updated: 7/9/2026, 3:06:22 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> q=new LinkedList<>();
       int count=0;
       for(int i=0;i<tickets.length;i++){
        q.offer(i);
       } 
       while(true){
        int curr=q.poll();
        tickets[curr]--;
        count++;
        if(curr==k && tickets[curr]==0){
            break;
        }
        if(tickets[curr]>0){
            q.offer(curr);
        }
       }
       return count;
    }
}