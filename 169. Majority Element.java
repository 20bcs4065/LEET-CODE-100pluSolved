class Solution {
    public int majorityElement(int[] nums) {
        int max=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==0){
                max=nums[i];
                c=1;
            }else if(nums[i]==max){
                c++;
            }else{
                c--;
            }
        }
    }
}
