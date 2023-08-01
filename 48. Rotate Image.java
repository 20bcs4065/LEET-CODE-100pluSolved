class Solution {
    public void rotate(int[][] matrix) {
        int p=matrix.length;
        int pp=0;
        ArrayList<ArrayList<Integer>> l2=new ArrayList<ArrayList<Integer>>();
        for(int k=0;k<p;k++){
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    if(j==pp){
                        l1.add(matrix[i][j]);
                    }
                }
            }
            Collections.reverse(l1);
            l2.add(l1);
            pp++;
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<p;j++){
                matrix[i][j]=l2.get(i).get(j);
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<p;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}
