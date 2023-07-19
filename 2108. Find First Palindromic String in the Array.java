class Solution {
    public String firstPalindrome(String[] words) {
        int c=0;
        StringBuilder y=new StringBuilder();
        for(String x:words){
            y.append(x);
            y.reverse();
            if(x.equals(y.toString())){
                c++;
                break;
            }
            y.setLength(0);
        }
        if(c==0){
            y.setLength(0);
        }
        return y.toString();
    }
}
