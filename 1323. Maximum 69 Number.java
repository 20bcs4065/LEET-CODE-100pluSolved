class Solution {
    public int maximum69Number (int num) {
        int c=0;
        String s=String.valueOf(num);
        String s2="";
        ArrayList<String> l1=new ArrayList<String>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        int a1[]=new int[s.length()];
        for(int i=0;i<s.length();i++) a1[i]=Integer.parseInt(s.charAt(i)+"");
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(s.charAt(i)+"")==6){
                c++;
                a1[i]=9;
                for(int x:a1) s2+=x;
                l1.add(s2);
                s2="";
                a1[i]=6;
            }
        }
        if(c==0) return Integer.parseInt(s+"");
        else for(String x:l1) l2.add(Integer.parseInt(x+""));
        Collections.sort(l2);
        if(l2.size()==1) return l2.get(0);
        else return l2.get(l2.size()-1);}}
