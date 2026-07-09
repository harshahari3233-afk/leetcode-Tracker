// Last updated: 7/9/2026, 3:09:59 PM
class Solution {
    public int reverseBits(int n) {
        int rev=0;
        while(n!=0){
            for(int i=0;i<32;i++)
            {
            rev=(rev<<1)+(n&1);
            n=n>>1;
            }
        }
        return rev;
    }
}