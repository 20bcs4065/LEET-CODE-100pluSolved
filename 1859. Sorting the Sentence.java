class Solution {
    public String sortSentence(String s) {
        String st,jr;
        st = s.replaceAll("[^0-9]", "");
        jr = s.replaceAll("[0-9]", "");
        String stra[]=jr.split(" ");
        String r[]=new String[stra.length];
        for(int i=0;i<st.length();i++){
            int a=(st.charAt(i)-48)-1;
            r[a]=stra[i];
        }
        String re="";
        for(String x:r){
            re+=x+" ";
        }
        return re.trim();  
    }
}
