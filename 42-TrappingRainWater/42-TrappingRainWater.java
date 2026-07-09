// Last updated: 7/9/2026, 3:11:40 PM
class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int l=0;
        int r=n-1;
        int ml=0;
        int mr=0;
        int water=0;
        while(r>l){
            if(h[r]>=h[l]){
                if(h[l]>=ml){
                    ml=h[l];
                }
                else{
                    water+=ml-h[l];
                }
            
            l++;
            }
            else{
                if(h[r]>=mr){
                    mr=h[r];
                }
                else{
                    water+=mr-h[r];
                }
            
            r--;
            }
        }
        return water;
    }
}