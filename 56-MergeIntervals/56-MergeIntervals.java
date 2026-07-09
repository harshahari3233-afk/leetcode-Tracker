// Last updated: 7/9/2026, 3:11:36 PM
class Solution {
    public int[][] merge(int[][] nums) {
        int n=nums.length;
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        List <int[]> list=new ArrayList<>();
        int start=nums[0][0];
        int end=nums[0][1];
        for(int i=1;i<n;i++){
            if(nums[i][0]<=end){
                end=Math.max(end,nums[i][1]);
            }
            else{
                list.add(new int[]{start,end});
                start=nums[i][0];
                end=nums[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}