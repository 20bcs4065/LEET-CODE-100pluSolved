class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> l1=new ArrayList();
        for(int i=0;i<words.size();i++){
            String a=words.get(i);
            String a1[]=a.split("["+separator+"]");
            for(String x:a1){
                if(x.length()>=1)
                    l1.add(x);
            }
        }
    return l1;
    }
}
