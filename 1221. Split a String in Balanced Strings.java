class Solution {
    public int balancedStringSplit(String s) {
      int c=0,s1=0,s2=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='R'){
              s1++;
          }
          if(s.charAt(i)=='L'){
              s2++;
          }
          if(s1==s2){
              c++;
              s1=0;
              s2=0;
          }
      }
      return c;
    }
}
