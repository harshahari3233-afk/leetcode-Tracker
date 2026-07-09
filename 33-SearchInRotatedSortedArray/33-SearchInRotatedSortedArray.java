// Last updated: 7/9/2026, 3:11:46 PM
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(r>=l){
            int mid=l+((r-l)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && nums[mid]>target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]<target && nums[r]>=target){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}