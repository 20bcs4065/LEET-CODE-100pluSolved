class Solution {
    public int maximumValue(String[] strs) {
        int c=0;
        List <Integer>l1=new ArrayList<>();
        for(String x:strs){
            if(x.matches("\\d+")){
                int xx=Integer.parseInt(x);
                l1.add(xx); 
            }else if(x.matches("[a-zA-Z0-9]+") || x instanceof String){
                c=x.length();
                l1.add(c);
                c=0;  
            }
        }
        Collections.sort(l1);
        return l1.get(l1.size()-1);}}
