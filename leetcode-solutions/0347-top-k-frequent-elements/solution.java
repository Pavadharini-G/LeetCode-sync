class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(freq.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int[] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i).getKey();
        }
        return result;
    }
}
