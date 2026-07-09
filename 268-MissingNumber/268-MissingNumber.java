// Last updated: 7/9/2026, 3:09:00 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        int xor1=0;
        for(int i=0;i<=n;i++){
            xor=xor^i;
        }
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
        // int n=nums.length;
        // Arrays.sort(nums);
        // for (int i=0;i<n;i++){
        //     if(i!=nums[i]){
        //         return i;
        //     }
        // }
        // return n;
    }
}