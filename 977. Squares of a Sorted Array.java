class Solution {
    public int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for(int x:nums){
            a[j]=x*x;
            j++;
        }
        Arrays.sort(a);
        return a;}}
