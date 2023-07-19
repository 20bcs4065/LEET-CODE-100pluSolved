class Solution {
    public int[] decompressRLElist(int[] nums) {
        int s=0,ind=0;
        for(int i=0;i<nums.length;i+=2){
            s=s+nums[i];
        }
        int r[]=new int[s];
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                r[ind]=val;
                ind++;
            }
        }
          return r;
    }
}
