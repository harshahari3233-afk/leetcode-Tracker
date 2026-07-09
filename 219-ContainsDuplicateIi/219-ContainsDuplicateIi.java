// Last updated: 7/9/2026, 3:09:26 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        int cnum=nums[i];
        if(map.containsKey(cnum)){
            int cid=map.get(cnum);
            if(i-cid<=k){
                return true;
            }
        }
        map.put(cnum,i);
       }
       return false; 
    }
}