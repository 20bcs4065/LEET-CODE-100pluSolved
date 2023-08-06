class Solution {
    public boolean rotateString(String s, String goal) {
        String res=s;
        int c=0;
        boolean x=false;
        for(int i=0;i<s.length();i++){
            c++;
            res+=s.charAt(i);
            StringBuilder cc=new StringBuilder(res);
            cc.delete(0,1);
            String r=cc+"";
            res=r;
            if(r.equals(goal)){
                x=true;
            }else if(c==s.length()){
                x= false;
            }
            if(x==true) break;
        }
        
        return x;
    }
}
