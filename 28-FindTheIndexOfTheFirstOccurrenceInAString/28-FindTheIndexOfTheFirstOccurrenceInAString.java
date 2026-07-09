// Last updated: 7/9/2026, 3:11:51 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int l1=needle.length();
        int l2=haystack.length();
        int count=0;
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=l2-l1;i++){
            String news=haystack.substring(i,i+l1);
            if(news.equals(needle)){
                return count;
            }
            count++;
        }
        return -1;
            
    }
}