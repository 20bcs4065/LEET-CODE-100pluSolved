class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String x:words){
            if(s.startsWith(x))
                c+=1;
        }
        return c;}}
