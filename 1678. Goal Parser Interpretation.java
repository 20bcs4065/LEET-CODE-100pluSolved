class Solution {
    public String interpret(String command) {
        String s1="G",s2="o",s3="al";
        String a=command.replace("()","o");
        a=a.replace("(al)","al");
        a=a.replace("G","G");
        return a;
    }
}
