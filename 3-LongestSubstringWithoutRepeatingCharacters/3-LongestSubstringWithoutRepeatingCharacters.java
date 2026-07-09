// Last updated: 7/9/2026, 3:12:18 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set<Character> set=new HashSet<>(); 
        int left=0;
        int max=0;
        for(int r=0;r<n;r++){
            while(!set.add(s.charAt(r))){
               set.remove(s.charAt(left));
               left++;
            }
                set.add(s.charAt(r));
                max=Math.max(max,r-left+1);
            
        }
        return max;
    }
}