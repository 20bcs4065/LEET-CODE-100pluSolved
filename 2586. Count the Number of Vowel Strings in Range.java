class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String  v="aeiou";
        int c=0;
        for(int i=left;i<=right;i++){
            if(words[i].length()==1) if(v.contains(words[i])) c++;
            if(words[i].length()!=1){
                String l=String.valueOf(words[i].charAt(0));
                String r=String.valueOf(words[i].charAt(words[i].length()-1));
                if(v.contains(l) && v.contains(r)) c++;
            }
        }
        System.gc();
        return c;}}
