class Solution {
    public String decodeMessage(String key, String message) {
        String s="",ss="";
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)!=' ' && s.indexOf(key.charAt(i))==-1){
                s+=key.charAt(i);
            }
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' '){
                int a=s.indexOf(message.charAt(i));
                ss+=(char)('a'+a);
            }else{
                ss+=' ';
            }
        }
        return ss;
    }}
