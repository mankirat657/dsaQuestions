class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int lf = 0;
       int maxlen = 0;
       for(int i = 0;i < fruits.length ;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[lf],map.get(fruits[lf]) - 1);
                if(map.get(fruits[lf]) == 0){
                    map.remove(fruits[lf]);
                }
                lf++;
            }
                maxlen = Math.max(maxlen,i-lf + 1);
       } 
       return maxlen;
    }
}