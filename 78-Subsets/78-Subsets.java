// Last updated: 7/9/2026, 3:11:21 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        a(0,nums,l,l1);
        return l;
    }
    public void a(int ind,int[] nums,List<List<Integer>> l,List<Integer> l1){
        l.add(new ArrayList<>(l1));
        for(int i=ind;i<nums.length;i++){
            l1.add(nums[i]);
            a(i+1,nums,l,l1);
            l1.remove(l1.size()-1); 
        }
    }
}