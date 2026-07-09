// Last updated: 7/9/2026, 3:12:06 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String a=strs[0];
        int l=strs.length;
        for(int i=0;i<l;i++){
            int le=strs[i].length();
            int min=Math.min(a.length(),le);
            for (int j=0;j<min;j++){
                if(a.charAt(j)!=strs[i].charAt(j)){
                    a=a.substring(0,j);
                    break;
                }
            
            }
            if(a.length()>min){
                a=a.substring(0,min);
            }
        } 
        return a;
    }
}