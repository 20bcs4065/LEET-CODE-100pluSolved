class Solution {
    public int countPoints(String rings) {
        int c=0;
        int R[]=new int[10];
        int G[]=new int[10];
        int B[]=new int[10];
        for(int i=0;i<rings.length()-1;i+=2){
            int j=i+1;
            char a=rings.charAt(i);
            int b=rings.charAt(j)-'0';
            if('R'== a)
                R[b]++;
            else if('G'==a)
                G[b]++;
            else
                B[b]++;
        }
        for(int i=0;i<10;i++){
            if(R[i]>=1 && G[i]>=1 && B[i]>=1){
                c++;
            }
        }
        return c;}}
