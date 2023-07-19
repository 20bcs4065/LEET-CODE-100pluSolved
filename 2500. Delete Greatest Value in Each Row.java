class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int s=0;
        for(int i=0;i<grid.length;i++){
                Arrays.sort(grid[i]);
        }
        int i=grid[0].length-1;
        while(i>=0){
          int m=grid[0][i];
          for(int j=0;j<grid.length;j++){
              if(m<grid[j][i])
                  m=grid[j][i];
          }
          s+=m;
          i--;
        }
        return s;}}
