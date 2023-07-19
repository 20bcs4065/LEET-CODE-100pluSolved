class Solution {
    public int[] buildArray(int[] nums) {
        int a1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a1[i]=nums[nums[i]];
        }
        return a1;
    }
}
