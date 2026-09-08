class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> table = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] chars = s.toCharArray();
            Map<Character, Integer> freq = new HashMap<>();
            
            for (char c : chars) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            if (table.containsKey(freq)) {
                table.get(freq).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                table.put(freq, list);
            }
        }

        return new ArrayList<>(table.values());
    }
}
