class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String x:patterns){
            if(word.contains(x)){
                c++;
            }
        }
        return c;
    }
}
