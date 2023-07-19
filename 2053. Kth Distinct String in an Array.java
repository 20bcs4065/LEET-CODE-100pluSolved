class Solution {
    public String kthDistinct(String[] arr, int k) {
        int c=0;
        List <String> s3=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j]))
                    c++;
            }
            if(c==1){
                s3.add(arr[i]);
                c=0;
            }else
                c=0;
        }
        if(s3.size()>=k)
            return s3.get(k-1);
        else
            return "";}}
