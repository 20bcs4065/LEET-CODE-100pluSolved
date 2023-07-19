class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="",s2="",s3="";
        for(int i=0;i<firstWord.length();i++){
            s1+=firstWord.charAt(i)-'a';
        }
        for(int i=0;i<secondWord.length();i++){
            s2+=secondWord.charAt(i)-'a';
        }
        for(int i=0;i<targetWord.length();i++){
            s3+=targetWord.charAt(i)-'a';
        }
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int z=Integer.parseInt(s3);
        if(x+y==z)
            return true;
        else
            return false;}}
