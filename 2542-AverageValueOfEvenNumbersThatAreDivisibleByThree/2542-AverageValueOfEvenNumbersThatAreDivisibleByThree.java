// Last updated: 7/9/2026, 3:06:03 PM
class Solution {
    public int averageValue(int[] nums) {
        int evsum=0;
        int count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                evsum+=nums[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        int avg=(evsum/count);
        return avg;
    }
}