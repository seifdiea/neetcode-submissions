class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> occ = new HashMap<>();

        for (int n : nums) {
            occ.put(n, occ.getOrDefault(n, 0) + 1);
        }

        int max = 0;
        for (int frequency : occ.values()) {
            max = Math.max(frequency, max);
        }

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= max; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : occ.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            buckets.get(frequency).add(number);
        }

        int j = 0;

        for (int i = max; i >= 1 && j < k; i--) {
            for (int number : buckets.get(i)) {
                result[j++] = number;

                if (j == k) {
                    break;
                }
            }
        }

        return result;
    }
}
