// Last updated: 7/9/2026, 3:08:03 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String[] words=s.split(" ");
        int n=words.length;
        for(int i=0;i<n;i++){
            String part=words[i];
            int len=part.length();
            String rev="";
            for(int j=len-1;j>=0;j--){
                rev+=part.charAt(j);
            }
            if(i<n-1){
            rev+=" ";
            }
            str.append(rev);
        }
        return str.toString();
    }
}