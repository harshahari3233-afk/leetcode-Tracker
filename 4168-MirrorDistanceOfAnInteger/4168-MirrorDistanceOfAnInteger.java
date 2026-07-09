// Last updated: 7/9/2026, 3:05:16 PM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int a=n;
        while(n>0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        return Math.abs(rev-a);
    }
}