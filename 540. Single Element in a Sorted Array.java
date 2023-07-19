class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x=0;
        int r[]=new int[100000];
        for(int i=0;i<nums.length;i++){
            r[nums[i]]++;
        }
        for(int i=0;i<r.length;i++){
            if(r[i]==1){
                x=i;
            }
        }
        return x;
    }
}
