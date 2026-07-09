// Last updated: 7/9/2026, 3:11:22 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l1=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        helper(1,n,k,l,l1);
        return l1;
    }
    public void helper (int i,int n,int k,List<Integer> l,List<List<Integer>> l1){
        if(l.size()==k){
            l1.add(new ArrayList<>(l));
            return ;
        }
        while(i<=n){
            l.add(i);
            helper(i+1,n,k,l,l1);
            l.remove(l.size()-1);
            i++;
        }
    }
}