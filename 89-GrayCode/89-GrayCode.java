// Last updated: 7/9/2026, 3:11:12 PM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<=(1<<n)-1;i++){
            int grey=i^(i>>1);
            a.add(grey);
        }
        return a;
    }
}