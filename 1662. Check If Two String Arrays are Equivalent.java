class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for(String x:word1){
            s1.append(x);
        }
        for(String x:word2){
            s2.append(x);
        }
        return s1.compareTo(s2)==0;
    }
}
