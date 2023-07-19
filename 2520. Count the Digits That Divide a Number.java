class Solution {
    public int countDigits(int num) {
        String a=String.valueOf(num);
        int c=0;
        for(int i=0;i<a.length();i++){
            int b=Integer.parseInt(a.charAt(i)+"");
            if(num%b==0) c++;
        } 
        return c;}}
