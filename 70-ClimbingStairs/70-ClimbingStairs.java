// Last updated: 7/9/2026, 3:11:27 PM
class Solution {
    public int climbStairs(int n) {
        int current=1;
        int next=2;
        int temp=0;
        if(n<=2){
            return n;
        }
        for(int i=3;i<=n;i++){
            temp=next+current;
            current=next;
            next=temp;
    }
        return temp;
    }
}