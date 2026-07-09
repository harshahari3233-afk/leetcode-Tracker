// Last updated: 7/9/2026, 3:08:37 PM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;

        }
        return a;
    }
}