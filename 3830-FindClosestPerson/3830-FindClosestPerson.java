// Last updated: 7/9/2026, 3:05:25 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(z-x);
        int d2=Math.abs(z-y);
        if(d1>d2){
            return 2;
        }
        else if(d2>d1){
            return 1;
        }
        return 0;
    }
}