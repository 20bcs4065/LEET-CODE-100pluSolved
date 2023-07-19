class Solution {
    public String freqAlphabets(String s) {
        for(int i=10;i<=26;i++){
            s=s.replaceAll(i+"#",(char)('a'+(i-1))+"");
        }
        for(int i=1;i<=9;i++){
            s=s.replaceAll(i+"",(char)('a'+(i-1))+"");
        }
        return s;
    }
}
