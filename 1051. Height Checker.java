class Solution {
    public int heightChecker(int[] heights) {
        int a1[]=new int[heights.length];
        int i=0,c=0;
        for(int x:heights){
            a1[i]=x;
            i++;
        }
        Arrays.sort(a1);
        for(int j=0;j<heights.length;j++) if(heights[j]!=a1[j]) c++;
        System.gc();
        return c;}}
