// Last updated: 7/9/2026, 3:08:57 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        int n=pattern.length();
        String[] arr=s.split(" ");
        int m=arr.length;
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            char c=pattern.charAt(i);
            String word=arr[i];
            if(map1.containsKey(c)){
                if(!(map1.get(c).equals(word))){
                    return false;
                }
            }
            else{
                map1.put(c,word);
            }
            if(map2.containsKey(word)){
                if(!(map2.get(word).equals(c))){
                    return false;
                }
            }
            else{
                map2.put(word,c);
            }
        }

        return true;
    }
}