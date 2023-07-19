class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++){
            if("++X".equals(operations[i]) || "X++".equals(operations[i])){
                X+=1;
            }else if("--X".equals(operations[i]) || "X--".equals(operations[i])){
                X-=1;
            }
        }
        return X;
    }
}
