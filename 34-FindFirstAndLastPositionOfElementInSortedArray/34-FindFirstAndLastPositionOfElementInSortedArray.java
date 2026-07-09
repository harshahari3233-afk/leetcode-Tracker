// Last updated: 7/9/2026, 3:11:45 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] a=new int[2];
        Arrays.fill(a,-1);
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+((right-left)/2);
            if(nums[mid]==target){
                a[0]=mid;
                right=mid-1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }
            left=0;
            right=n-1;
            while(left<=right){
            int mid=left+((right-left)/2);
            if(nums[mid]==target){
                a[1]=mid;
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
        }
        return a;
    }
}