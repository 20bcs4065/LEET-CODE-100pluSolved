class Solution {
    public boolean checkIfPangram(String sentence) {
        int c=0;
        if(sentence.length()<26) return false;
        else{
            for(char i='a';i<='z';i++) if(sentence.contains(i+"")) c++;
            System.gc();
            if(c>=26) return true;
            else return false;
        }}}
