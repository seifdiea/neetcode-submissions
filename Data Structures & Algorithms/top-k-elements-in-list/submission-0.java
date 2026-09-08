class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> countArray = new ArrayList<>(nums.length);

        ArrayList<Integer> sol = new ArrayList<>(k);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {
            countArray.add(i, new ArrayList<>());
        }

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int key : map.keySet()){
            int v = map.get(key);
            countArray.get(v).add(key);
        }

        for(int j = nums.length; j>-1;j--){
            if(countArray.get(j).isEmpty())
                continue;
            
            sol.addAll(countArray.get(j));
            k -= countArray.get(j).size();

            if(k==0)
                break;
            
        }

        int[] res = new int[sol.size()];
        for (int i = 0; i < sol.size(); i++) {
            res[i] = sol.get(i);
        }
        return res;
    }
}
