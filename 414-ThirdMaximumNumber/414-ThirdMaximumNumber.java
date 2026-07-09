// Last updated: 7/9/2026, 3:08:27 PM
class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        if(n<3){
            return nums[n-1];
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;
            }
            if(count==3){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}