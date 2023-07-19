class Solution {
    public int[] getConcatenation(int[] nums) {
        int r[]=new int[nums.length*2];
        int ind=0;
       for(int i=0;i<2;i++){
           for(int j=0;j<nums.length;j++){
               r[ind]=nums[j];
               ind++;
           }
       }
       return r;
    }
}
