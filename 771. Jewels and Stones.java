class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int c=0;
       for(int i=0;i<jewels.length();i++){
           char a=jewels.charAt(i);
           for(int j=0;j<stones.length();j++){
               char b=stones.charAt(j);
               int k=Character.compare(a,b);
               if(k==0){
                   c++;
               }
           }
       }
       return c;
    }
}
