class Solution 
{
    public int singleNumber(int[] nums) {
        int g=0;
        for(int x:nums) 
            g^=x;
            return g;
        }
}
