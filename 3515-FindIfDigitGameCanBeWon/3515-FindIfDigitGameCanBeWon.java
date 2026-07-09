// Last updated: 7/9/2026, 3:05:29 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a;i++){
            if(nums[i]<10){
                sum1+=nums[i];
            }
            else{
                sum2+=nums[i];
            }
        }
        if(sum1==sum2){
            return false;
        }
        else{
            return true;
        }
    }
}