class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
    int r[]={5,5};
    int rr[]=new int[mat.length];
    int c=0,p=0,cc=0;
    for(int x[]:mat){
        for(int y:x){
            if(y==1){
                c++;
                cc++;
            }
        }
        rr[p]=c;
        p++;
        c=0;
    }
    if(cc==0){
        r[0]=0;
        r[1]=0;
    }else{
        int max=0;
        for(int i=1;i<rr.length;i++) if(rr[i]>rr[max]) max=i;
        r[0]=max;
        Arrays.sort(rr);
        r[1]=rr[rr.length-1];
    }
    return r;}}
