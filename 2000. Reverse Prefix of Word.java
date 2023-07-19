class Solution {
    public String reversePrefix(String word, char ch) {
        int c=0;
        String r="";
        for(int i=0;i<word.length();i++){
            if(ch!=word.charAt(i))
                c++;
            else
                break;
        }
        if(c==word.length())
            r=word;
        else{
            for(int i=c;i>=0;i--){
            r+=word.charAt(i);
        }
        for(int i=c+1;i<word.length();i++){
            r+=word.charAt(i);
        }
        }
        return r;
    }
}
