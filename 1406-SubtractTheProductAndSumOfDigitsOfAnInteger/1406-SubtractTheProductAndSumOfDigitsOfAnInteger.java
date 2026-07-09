// Last updated: 7/9/2026, 3:07:04 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            sum+=n%10;
            pro=pro*(n%10);
            n=n/10;
        }
        return pro-sum;
    }
}