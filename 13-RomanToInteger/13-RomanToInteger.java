// Last updated: 7/9/2026, 3:12:11 PM
class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int num=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<len-1;i++){
            int curr=map.get(s.charAt(i));
            int next=map.get(s.charAt(i+1));
            if(curr<next){
                num-=curr;
            }
            else{
                num+=curr;
            }
        }
        num+=map.get(s.charAt(len-1));
        return num;
    }
}