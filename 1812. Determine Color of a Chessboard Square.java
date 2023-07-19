class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=Integer.parseInt(coordinates.replaceAll("[^0-9]", ""));
        char b=coordinates.charAt(0);
        List <Character>r=new ArrayList();
        r.add('a');r.add('c');r.add('e');r.add('g');
        if(r.contains(b)){
            if(a%2==0)
                return true;
            else
                return false;
        }else{
            if(a%2==0)
                return false;
            else
                return true;
        }}}
