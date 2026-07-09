// Last updated: 7/9/2026, 3:11:34 PM
class Solution {
    public int[][] insert(int[][] nums, int[] newnums) {
        List<int[]> list=new ArrayList<>();
        int n=nums.length;
        int start=newnums[0];
        int end=newnums[1];
        for(int i=0;i<n;i++){
            if(nums[i][1]<start){
                list.add(nums[i]);
            }
            else if(nums[i][0]>end){
                list.add(new int[]{start,end});
                start=nums[i][0];
                end=nums[i][1];
            }
            else{
                start=Math.min(start,nums[i][0]);
                end=Math.max(end,nums[i][1]);
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}