class Solution {
    public int maximumWealth(int[][] accounts) {
        int r[]=new int[accounts.length];
        int temp;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
                r[i]=sum;
            }
        }
        for(int i=0;i<accounts.length;i++){
            for(int j=i+1;j<accounts.length;j++){
                 if(r[i]>r[j]){
                     temp=r[i];
                     r[i]=r[j];
                     r[j]=temp;
                 }
            }
        }
        int z=r[r.length-1];
        return z;
    }
}
