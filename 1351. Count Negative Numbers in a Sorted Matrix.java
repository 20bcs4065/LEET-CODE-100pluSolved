class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int x[]:grid) for(int y:x) if(y<0) c++;
        return c;}}
