class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        String a1[]=text.split(" ");
        char b1[]=brokenLetters.toCharArray();
        for(char x:b1){
            String k=String.valueOf(x);
            for(int i=0;i<a1.length;i++){
                if(a1[i].contains(k))
                    a1[i]=" ";
            }
        }
        for(int i=0;i<a1.length;i++){
            if(!(a1[i].equals(" ")))
                c++;
        }
        return c;}}
