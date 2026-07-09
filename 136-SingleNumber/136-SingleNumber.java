// Last updated: 7/9/2026, 3:10:35 PM
class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}