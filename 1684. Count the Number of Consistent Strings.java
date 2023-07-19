class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0,cc=0;
        for(int i=0;i<words.length;i++){
                String a=words[i];
                int l=a.length();
                for(int k=0;k<l;k++){
                    for(int ll=0;ll<allowed.length();ll++){
                      if(a.charAt(k)==allowed.charAt(ll)){
                        c++;
                     }
                   }
                }
                if(l==c){
                    cc++;
                    c=0;
                }else{
                  c=0;
                }
        }
        return cc;
    }
}
