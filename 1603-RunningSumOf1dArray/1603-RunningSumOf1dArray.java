// Last updated: 7/9/2026, 3:06:55 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        int count=0;
        int[] a=new int[n];
        f(nums,a,sum,n,count);
        return a;
    }
    public void f(int[] nums,int[] a,int sum,int n,int count){
        if(count>n-1){
            return ;
        }
        else{
            sum+=nums[count];
            a[count]=sum;
            f(nums,a,sum,n,count+1);
        }
    }
}