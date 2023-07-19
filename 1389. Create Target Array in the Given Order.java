class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List <Integer> l1=new ArrayList <Integer>();
        for(int i=0;i<nums.length;i++) l1.add(index[i],nums[i]);
        int r[]=new int[l1.size()];
        for(int i=0;i<nums.length;i++) r[i]=l1.get(i);
        return r;}}
