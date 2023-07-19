class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0,l=mat.length;
        if(l==1)
            return mat[0][0];
        else{
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++)
                    if(i==j || i+j==l-1) s+=mat[i][j];
            }
        }
        return s;}}
