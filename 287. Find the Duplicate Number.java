class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int freq[]=new int[nums[nums.length-1]+1];
        int s=0;
        for(int x:nums){
            freq[x]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1) s=i;
        }
        return s;
    }
}
