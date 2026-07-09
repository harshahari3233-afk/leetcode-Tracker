// Last updated: 7/9/2026, 3:05:23 PM
class Solution {
    public String processStr(String s) {
        StringBuilder a=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                a.append(c);
            }
            else if(c=='*'){
                if(a.length()!=0){
                a.deleteCharAt(a.length()-1);
                }
            }
            else if(c=='#'){
                a.append(a);
            }
            else if(c=='%'){
                a.reverse();
            }
        }
        return a.toString();
    }
}