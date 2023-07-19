class Solution {
    public int prefixCount(String[] words, String pref) {
        int cc=0;
        for(String x:words){
            if(x.startsWith(pref)){
                cc++;
            }
        }
        return cc;
    }
}
