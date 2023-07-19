class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int s=0,c=0;
        int a[]=new int[mat.length];
        int b[]=new int[mat.length];
        int r[]=new int[k];
        int rr[]=new int[k];
        for(int x[]:mat){
            for(int i=0;i<x.length;i++){
                if(x[i]==1)
                    c++;
            }
            a[s]=c;
            b[s]=c;
            s++;
            c=0;
        }
        Arrays.sort(b);
        for(int i=0;i<k;i++)
            r[i]=b[i];
        for(int i=0;i<r.length;i++){
            for(int j=0;j<a.length;j++){
                if(r[i]==a[j]){
                    rr[i]=j;
                    a[j]=90;
                    break;
                }
            }
        }
        return rr;}}
