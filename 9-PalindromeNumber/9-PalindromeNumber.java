// Last updated: 7/9/2026, 3:12:12 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int n=x;
            int rev=0;
            while(n!=0){
                rev=rev*10+(n%10);
                n=n/10;
            }
            if(x==rev){
                return true;
            }
        }
        return false;
        
    }
}