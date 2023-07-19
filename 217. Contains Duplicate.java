class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        boolean a=true;
        if(nums.length==1) a=false;
        else{
            for(int i=0;i<nums.length-1;i++) if(nums[i]==nums[i+1]) c++;
            if(c==0) a=false;
            else a=true;
        }
        System.gc();
        return a;}}
