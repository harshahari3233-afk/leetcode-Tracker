// Last updated: 7/9/2026, 3:05:54 PM
class Solution {
    public int alternateDigitSum(int n) {
        int rev=0;
        int a=n;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        int sum=0;
        int count=0;
        while(rev>0){
            if(count%2==0){
                sum+=(rev%10);
            }
            else{
                sum-=(rev%10);
            }
            count++;
            rev=rev/10;
        }
        return sum;
        
    }
}