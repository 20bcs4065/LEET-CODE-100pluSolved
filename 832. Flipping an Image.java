class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i2[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image[i].length-1;j>=0;j--){
                i2[i][k]=image[i][j];
                k++;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(i2[i][j]==1)
                    i2[i][j]=0;
                else
                    i2[i][j]=1;
            }
        }
        return i2;}}
