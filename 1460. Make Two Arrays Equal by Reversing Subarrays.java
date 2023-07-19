class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean a=true;
        Arrays.sort(arr);
        Arrays.sort(target);
        for(int i=0;i<target.length;i++){
            if(target[i]==arr[i])
                a=true;
            else{
                a=false;
                break;
            }
        }
        return a;}}
