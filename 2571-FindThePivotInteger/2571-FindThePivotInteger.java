// Last updated: 7/9/2026, 3:06:01 PM
class Solution {
    public int pivotInteger(int n) {
        int a=(n/2);
        int sum1=0;
        int sum2=0;
        int total=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            sum1+=i;
            sum2=total-(sum1-i);
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}