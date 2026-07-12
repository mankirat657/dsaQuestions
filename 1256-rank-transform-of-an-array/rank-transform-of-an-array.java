class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int count = 1;
        int[] result = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < result.length; i++){
            result[i] = arr[i];
        }
        Arrays.sort(result);
        for(int i = 0; i < result.length; i++){
                 if (!map.containsKey(result[i])) {
                 map.put(result[i], count);
                 count++;
            }
        }
        for(int i = 0; i < result.length; i++){
                result[i] = map.get(arr[i]);
        }

        return result;
    }
}