class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            char[] chrArr = strs[i].toCharArray();
            Arrays.sort(chrArr);
            String value = new String(chrArr);
            if(map.containsKey(value)){
                map.get(value).add(strs[i]);
            }else{
                map.put(value,new ArrayList<>(List.of(strs[i])));
            }
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}