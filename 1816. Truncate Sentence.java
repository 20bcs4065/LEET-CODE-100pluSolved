class Solution {
    public String truncateSentence(String s, int k) {
        String s1[]=s.split(" ");
        String r1[]=new String[k];
        for(int i=0;i<k;i++){
            r1[i]=s1[i];
        }
        String a="";
        for(int i=0;i<k;i++){
            a+=r1[i]+" ";
        }
        return a.trim();
    }
}
