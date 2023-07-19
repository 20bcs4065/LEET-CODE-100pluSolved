class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        List <Integer>l1=new ArrayList<>();
        int c=0;
        for(int[] x:rectangles){
            int i=0; 
           if(x[i]<x[i+1])
               l1.add(x[i]);
           else
               l1.add(x[i+1]);
        }
        Collections.sort(l1);
        int l=l1.get(l1.size()-1);
        for(int x:l1){
            if(l==x)
                c++;
        }
        return c;}}
