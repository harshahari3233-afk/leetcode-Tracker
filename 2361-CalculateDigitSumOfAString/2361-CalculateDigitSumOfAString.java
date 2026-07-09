// Last updated: 7/9/2026, 3:06:16 PM
class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder n=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                int sum=0;
                for(int j=i;j<i+k && j<s.length();j++){
                    sum+=s.charAt(j)-'0';
                }
                n.append(sum);
            }
            s=n.toString();
        
        }
        return s;
    }
}