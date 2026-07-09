// Last updated: 7/9/2026, 3:05:56 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int ele=0;
        int dig=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            ele+=nums[i];
            while(nums[i]!=0){
                dig+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(dig-ele);
    }
}