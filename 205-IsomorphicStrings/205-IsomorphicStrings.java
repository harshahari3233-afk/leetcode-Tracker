// Last updated: 7/9/2026, 3:09:46 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(map1.containsKey(c1)){
                if(!map1.get(c1).equals(c2)){
                    return false;
                }
            }
            else{
                map1.put(c1,c2);
            }
            if(map2.containsKey(c2)){
                if(!map2.get(c2).equals(c1)){
                    return false;
                }
            }
            else{
                map2.put(c2,c1);
            }
        }
        return true;
    }
}