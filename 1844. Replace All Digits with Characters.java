class Solution {
    public String replaceDigits(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                r+=s.charAt(i);
            }
            else {
                int n=Integer.parseInt(s.charAt(i)+"");
                char nn=s.charAt(i-1);
                nn+=n;
                r+=nn;
            }
        }
        return r;
    }
}
