class Solution {
    public int[] separateDigits(int[] nums) {
        List <Integer>l1=new ArrayList<>();
        for(Integer x:nums){
            String a=String.valueOf(x);
            for(int i=0;i<a.length();i++){
                char aa=a.charAt(i);
                int k=Integer.parseInt(aa+"");
                l1.add(k);
            }
        }
        int l2[]=new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            l2[i]=l1.get(i);
        }
        return l2;}}
