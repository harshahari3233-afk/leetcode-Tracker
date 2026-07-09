// Last updated: 7/9/2026, 3:05:21 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[mid]){
                count++;
            }
        }
        
        return count==1;
    }
}