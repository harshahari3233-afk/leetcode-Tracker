// Last updated: 7/9/2026, 3:11:53 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}