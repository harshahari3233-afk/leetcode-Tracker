// Last updated: 7/9/2026, 3:12:16 PM
class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        if(rev<=2147483647 && rev>=-2147483647){
        return (int)rev;
        }
        else{
            return 0;
        }
    }
}