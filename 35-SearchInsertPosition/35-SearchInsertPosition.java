// Last updated: 7/9/2026, 3:11:43 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(r>=l){
            int mid=l+((r-l)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                l=mid+1;
            }
            if(nums[mid]>target){
                r=mid-1;
            }
        }
        return l;
    }
}