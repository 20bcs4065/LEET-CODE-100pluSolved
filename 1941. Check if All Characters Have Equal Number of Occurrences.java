class Solution {
    public boolean areOccurrencesEqual(String s) {
       Set <Character>s1=new HashSet<>();
       List <Integer> l1=new ArrayList<>();
       int c=0,r=0;
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        char a1[]=new char[s1.size()];
        int l=0;
        for(char x:s1){
            a1[l]=x;
            l++;
        }
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<s.length();j++){
                if(a1[i]==s.charAt(j)){
                    c++;
                }
            }
            l1.add(c);
            c=0;
        }
        int xx=l1.get(0);
        for(int y:l1){
            if(y!=xx){
                r++;
            }
        }
        if(r==0)
            return true;
        else
            return false;
    }}
