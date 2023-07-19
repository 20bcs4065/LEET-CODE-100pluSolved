class Solution {
    public boolean halvesAreAlike(String s) {
        int c=0,cc=0;
        int a=s.length()/2;
        String vo="aeiouAEIOU";
        String s1="",s2="";
        for(int i=0;i<a;i++){
            s1+=s.charAt(i);
        }
        for(int i=a;i<s.length();i++){
            s2+=s.charAt(i);
        }
        for(int i=0;i<s1.length();i++){
            if(vo.contains(s1.charAt(i)+"")){
                c++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(vo.contains(s2.charAt(i)+"")){
                cc++;
            }
        }
        if(c==cc)
            return true;
        else
            return false;
    }
}
