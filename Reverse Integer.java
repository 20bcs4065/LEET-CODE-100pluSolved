class Solution {
    public int reverse(int x) {
        int max=Integer.MAX_VALUE;
        long rev=0;
        int rem;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev > Math.pow(2,31) || rev < Math.pow(-2,31)) return 0;
        else return (int)rev;}}
