// Last updated: 7/9/2026, 3:10:24 PM
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[right]<nums[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}