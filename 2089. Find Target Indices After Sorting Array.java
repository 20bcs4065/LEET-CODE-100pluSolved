class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int a=i;
                l1.add(a);
            }
        }
        return l1;}}
