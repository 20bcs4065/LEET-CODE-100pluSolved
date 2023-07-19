class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0,cc=n;
        int r[]=new int[nums.length];
        for(int i=0;i<cc;i++){
            r[j]=nums[i];
            r[j+1]=nums[n];
            j+=2;
            n++;
        }
        return r;
    }
}
