// Last updated: 7/9/2026, 3:10:23 PM
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int right=n-1;
        int left=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[right]<nums[mid]){
                left=mid +1;
            }
            else if(nums[right]>nums[mid]){
                right=mid;
            }
            else{
                right--;
            }
        }
        return nums[left];
    }
}