// Last updated: 7/9/2026, 3:11:41 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        a(0,candidates,target,new ArrayList<>(),l);
        return l;
    }
    public void a(int i,int[] can,int t,List<Integer> l1,List<List<Integer>> l){
        if(t==0){
            l.add(new ArrayList<>(l1));
            return;
        }
        if(i==can.length || t<0){
            return;
        }
        l1.add(can[i]);
        a(i,can,t-can[i],l1,l);
        l1.remove(l1.size()-1);
        a(i+1,can,t,l1,l);
    }
}