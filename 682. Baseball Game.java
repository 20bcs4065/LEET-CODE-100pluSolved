class Solution {
    public int calPoints(String[] operations) {
        int s=0;
        List <Integer>l1=new ArrayList<>();
        for(String x:operations){
            if(x.equals("C")){
                if(l1.size()==0)
                    break;
                else
                    l1.remove(l1.size()-1);
            }else if(x.equals("D")){
                if(l1.size()==0)
                    break;
                else{
                    int o=l1.get(l1.size()-1);
                    l1.add(o*2);
                }
            }else if(x.equals("+")){
                int ooo=l1.get(l1.size()-2);
                int oo=l1.get(l1.size()-1);
                l1.add(ooo+oo);
            }
            else{
                int a=Integer.parseInt(x);
                l1.add(a);
            }
        }
        for(int x:l1){
            s+=x;
        }
        return s;}}
