class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List l1=new ArrayList <>();
            int t=Arrays.stream(candies).max().getAsInt();
            for(int i=0;i<candies.length;i++){
                if(extraCandies+candies[i]>=t){
                   l1.add(true);
                }else{
                   l1.add(false);
                }
            }
        return l1;
    }
}
