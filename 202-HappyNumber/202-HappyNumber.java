// Last updated: 7/9/2026, 3:09:50 PM
class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=ss(slow);
            fast=ss(ss(fast));
        }while(slow!=fast);
        return slow==1;


    }
        private static int ss(int n){
            int sum=0;
            while(n!=0){
                sum+=Math.pow((n%10),2);
                n=n/10;
            }
            return sum;
        }
    }