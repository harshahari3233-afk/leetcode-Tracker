// Last updated: 7/9/2026, 3:06:37 PM
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int f=0;
        int j=0;
        for(int i=0;i<n;i++){
           j=(i+1)%n;
           if(nums[i]>nums[j]){
            f++;
           }

        }
        return f<=1;
    }
}