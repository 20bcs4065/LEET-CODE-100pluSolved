class Solution {
    public int subtractProductAndSum(int n) {
        String a=String.valueOf(n);
        int s=1,ss=0;
        for(int i=0;i<a.length();i++) s*=Integer.parseInt(a.charAt(i)+"");
        for(int i=0;i<a.length();i++) ss+=Integer.parseInt(a.charAt(i)+"");
        return s-ss;}}
