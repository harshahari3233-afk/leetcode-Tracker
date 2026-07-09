// Last updated: 7/9/2026, 3:12:17 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] n3=new int[m+n];
        double mid=0;
        System.arraycopy(nums1,0,n3,0,m);
        System.arraycopy(nums2,0,n3,m,n);
        Arrays.sort(n3);
        int len=n3.length;
        if(len%2!=0){
            mid=n3[(0+len-1)/2];
        }
        else{
            mid=n3[0+(len-1)/2]+n3[(0+(len-1)/2)+1];
            mid=mid/2;
        }
        return mid;
    }

}