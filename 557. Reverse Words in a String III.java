class Solution {
    public String reverseWords(String s) {
        String n="",r="";
        int c=0,cc=0,sp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sp++;
                n+=i+" ";
            }
        }
        if(sp!=0){
          n=n.trim();
        String nn[]=n.split(" ");
        for(int i=0;i<nn.length;i++){
            int a=Integer.parseInt(nn[i]);
            c=cc;
            for(int j=a;j>=c;j--){
                r+=s.charAt(j);
                cc++;
            }
        }
        r+=" ";
        int b=Integer.parseInt(nn[nn.length-1]);
        for(int i=s.length()-1;i>=b;i--){
          r+=s.charAt(i);
        }
        }else{
          int op=s.length()-1;
          for(int i=op;i>=0;i--){
           r+=s.charAt(i);
         }
        }
        return r.trim();
    }
}
