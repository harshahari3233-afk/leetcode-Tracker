// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int ss=0;
        while(n!=0){
            ds+=n%10;
            ss+=(n%10)*(n%10);
            n=n/10;
        }
        if((ss-ds)>=50){
            return true;
        }
        else{
            return false;
        }
    }
}