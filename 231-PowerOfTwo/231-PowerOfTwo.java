// Last updated: 7/9/2026, 3:09:20 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0 && (n&n-1)==0){
            return true;
        }
        else{
            return false;
        }
    }
}