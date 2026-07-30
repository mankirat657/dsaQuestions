class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,List<Integer>> map = new HashMap<>();
        int[]res = new int[k];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(nums[i]);
            }else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(nums[i]) ;
                map.put(nums[i],l);
            }
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> map.get(b).size() - map.get(a).size());
        int count = 0;
        while(count < k){
            res[count] = keys.get(count);
            count++;
        }

        return res;
    }
}