// Last updated: 7/9/2026, 3:06:27 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] news=new int[2*n];
        for(int i=0;i<2*n;i++){
            news[i]=nums[i%n];
        }
        return news;
    }
}