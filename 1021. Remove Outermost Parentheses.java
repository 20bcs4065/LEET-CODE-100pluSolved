class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;
        String r="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && c==0){
                c++;
            }else if(s.charAt(i)=='(' && c>=1){
                r+=s.charAt(i);
                c++;
            }else if(s.charAt(i)==')' && c>1){
                r+=s.charAt(i);
                c--;
            }else if(s.charAt(i)==')' && c==1){
                c--;
            }
        }
        return r;
    }
}
