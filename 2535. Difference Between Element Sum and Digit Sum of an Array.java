class Solution {
    public int differenceOfSum(int[] nums){
        int sum=0,dig=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int t=nums[i]%10;
                dig+=t;
                nums[i]/=10;
            }
        }
        int r=sum-dig;
        if(r>=0){
            return r;
        }else{
            return r*-1;
        }
    }
}
