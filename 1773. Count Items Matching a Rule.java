class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int c=0,ind=0;
            if("type".equals(ruleKey)){
                ind=0;
            }else if("color".equals(ruleKey)){
                ind=1;
            }else if("name".equals(ruleKey)){
                ind=2;
            }
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(ind).equals(ruleValue)){
                    c++;
                }
            }
            return c;
    }
}
