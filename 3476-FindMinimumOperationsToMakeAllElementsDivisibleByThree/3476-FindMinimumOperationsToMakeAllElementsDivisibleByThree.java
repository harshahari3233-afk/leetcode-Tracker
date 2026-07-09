// Last updated: 7/9/2026, 3:05:32 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]%3!=0){
            num++;
           } 
            
        }
        return num;
    }
}