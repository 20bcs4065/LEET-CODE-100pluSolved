class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs[0].length();
        List <Character>l2=new ArrayList<>();
        int c=0;
        for(String x:strs){
            for(char y:x.toCharArray()){
                l2.add(y);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<l2.size()-n;j+=n){
                if(l2.get(j)>l2.get(j+n)){
                    c++;
                    break;
                }
            }
        }
        return c;}}
