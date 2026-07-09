// Last updated: 7/9/2026, 3:06:56 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int[] news=new int[len];
        int ind=0;
        for(int i=0;i<n;i++){
            news[ind++]=nums[i];
            news[ind++]=nums[i+n];
        }
        return news;
        
    }
}