class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int d=x;
        if(x>=0){
            while(x!=0){
            int b=x%10;
            a=(a*10)+b;
            x/=10;
        }
        if(d==a){
            return true;
        }else{
            return false;
        }
        }else{
            return false;
        }
    }
}
