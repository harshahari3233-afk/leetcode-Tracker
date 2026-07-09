// Last updated: 7/9/2026, 3:05:26 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] r=new int[n];
        for(int i=0;i<n;i++){
            int val=nums[i];
            r[i]=nums[(((i+val)%n)+n)%n];
        }
        return r;
    }
}