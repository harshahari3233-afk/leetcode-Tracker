// Last updated: 7/9/2026, 3:12:22 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=nums.length;
        int[] b=new int[2];
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(nums[i]+nums[j]==target){
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
         return b;
    }
}