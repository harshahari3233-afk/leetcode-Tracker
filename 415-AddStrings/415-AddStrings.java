// Last updated: 7/9/2026, 3:08:25 PM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder news=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int d1=(i>=0)?num1.charAt(i)-'0':0;
            int d2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=d1+d2+carry;
            carry=sum/10;
            int digit=sum%10;
            i--;
            j--;
            news.append(digit);
        }
        return news.reverse().toString();
    }
}