class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            int a=Integer.parseInt(n.charAt(i)+"");
            if(a>max)
                max=a;
        }
        return max;}}
