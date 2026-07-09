// Last updated: 7/9/2026, 3:10:17 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int value=columnTitle.charAt(i)-64;
            sum=sum*26+value;
        }
        return sum;
    }
}