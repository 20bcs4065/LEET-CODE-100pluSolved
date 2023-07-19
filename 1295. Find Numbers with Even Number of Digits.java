class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int x:nums){
            String xx=String.valueOf(x);
            int l=xx.length();
            if(l%2==0)
                c++;
        }
        return c;}}
