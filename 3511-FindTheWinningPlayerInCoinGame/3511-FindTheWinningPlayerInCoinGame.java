// Last updated: 7/9/2026, 3:05:31 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int l=75*x+10*y;
        int count=0;
        for(int i=0;l>=115;i++){
            if(x>=1 && y>=4){
            l=l-115;
            count++;
            x=x-1;
            y=y-4;
            }
            else{
                break;
            }
        }
        System.out.print(count);
        if(count%2==0){
            return "Bob";
        }
        else{
            return "Alice";
        }
}
}