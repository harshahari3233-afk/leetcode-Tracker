// Last updated: 7/9/2026, 3:05:53 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = (n - 1) * 2;        // total steps in one back-and-forth cycle
        int t = time % cycle;           // reduce time within cycle
        
        // Going forward
        if (t < n) {
            return 1 + t;
        }
        
        // Going backward
        return n - (t - (n - 1));
    }
}

