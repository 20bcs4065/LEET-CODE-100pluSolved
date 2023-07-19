class Solution {
    public int mostWordsFound(String[] sentences) {
         int temp;
         int r[]=new int[sentences.length];
         for(int i=0;i<sentences.length;i++){
             int c=0;
             String w=sentences[i];
             c=w.split(" ").length;
             r[i]=c;
         }
         for(int i=0;i<sentences.length;i++){
             for(int j=i+1;j<sentences.length;j++){
                 if(r[i]>r[j]){
                     temp=r[i];
                     r[i]=r[j];
                     r[j]=temp;
                 }
             }
         }
         int d=r[sentences.length-1];
        return d;
    }
}
