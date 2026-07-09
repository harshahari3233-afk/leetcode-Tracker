// Last updated: 7/9/2026, 3:08:59 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                ind++;
            }
        }
    }
}