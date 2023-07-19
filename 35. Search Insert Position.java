class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        int r[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            r[i]=nums[i];
        }
        r[r.length-1]=target;
        Arrays.sort(r);
        for(int i=0;i<r.length;i++){
            if(r[i]==target){
                c=i;
                break;
            }
        }
        return c;
    }
}
