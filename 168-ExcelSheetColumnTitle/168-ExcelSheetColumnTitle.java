// Last updated: 7/9/2026, 3:10:20 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String a="";
        while(columnNumber>0){
            columnNumber--;
            a+=((char)('A'+columnNumber%26));
            columnNumber/=26;
        }
        String rev="";
        int i=a.length()-1;
        int n=i;
        while(n>=0){
            rev+=a.charAt(i);
            i=i-1;
            n=n-1;
        }
        return rev;
    }
}