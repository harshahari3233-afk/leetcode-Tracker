// Last updated: 7/9/2026, 3:08:34 PM
class Solution {
    public char findTheDifference(String s, String t) {

        int ts=0;
        for(int i=0;i<t.length();i++){
            ts+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            ts-=s.charAt(i);
        }
        return (char)ts;
    }
}