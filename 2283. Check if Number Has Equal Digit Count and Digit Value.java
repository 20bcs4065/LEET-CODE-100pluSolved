class Solution {
    public boolean digitCount(String num) {
        int nums[]=new int[num.length()];
        int c=0;
        String s="";
        for(int i=0;i<num.length();i++){
            int d=Integer.parseInt(num.charAt(i)+"");
            nums[i]=d;
        }
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    c++;
                }
            }
            if(c==nums[i])
                s+="T";
            else
                s+="F";
            c=0;
        }
        if(!s.contains("F"))
            return true;
        else
            return false;
    }
}
