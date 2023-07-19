class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int r[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<r.length;j++){
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            r[i]=c;
        }
        return r;
    }
}
