// Last updated: 7/9/2026, 3:12:09 PM
class Solution {
    public int maxArea(int[] height) {
        int l=height.length;
        int h=0;
        int max=0;
        int wat=0;
        int le=0;
        int r=l-1;
        while(r>le){
            int w=r-le;
            h=Math.min(height[le],height[r]);
            wat=h*w;
            max=Math.max(wat,max);
            if(height[r]>height[le]){
                le++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}