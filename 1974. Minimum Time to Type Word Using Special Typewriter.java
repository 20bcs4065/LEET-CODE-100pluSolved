class Solution {
    public int minTimeToType(String word) {
        int s=word.length();
        char a='a';
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int d=Math.abs(a-c);
            s+=Math.min(d,26-d);
            a=c;
        }
        return s;}}
