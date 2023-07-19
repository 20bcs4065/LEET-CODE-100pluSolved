class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> s1=new HashSet<Integer>();
         Set<Integer> s2=new HashSet<Integer>();
         ArrayList<Integer> l1=new ArrayList<Integer>();
         ArrayList<Integer> l2=new ArrayList<Integer>();
         ArrayList<List<Integer>> l3=new ArrayList<List<Integer>>();
         for(int x:nums1) s1.add(x);
         for(int x:nums2) s2.add(x);
         for(int x:s1) if(!s2.contains(x)) l1.add(x);
         for(int x:s2) if(!s1.contains(x)) l2.add(x);
         l3.add(new ArrayList(l1));
         l3.add(new ArrayList(l2));
         System.gc();
         return l3;}}
