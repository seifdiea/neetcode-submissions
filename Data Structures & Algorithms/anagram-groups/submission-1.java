class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character, Integer>, ArrayList<String>> groups = new HashMap<>();
      

        for(String s: strs){
            HashMap<Character, Integer> occ = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                occ.put(c, occ.getOrDefault(c,0)+1);
            }

            // if(groups.isEmpty()){
            //     groups.put(occ, new ArrayList<String>().add(s));
            // }
            
                ArrayList<String> list =
                groups.getOrDefault(occ, new ArrayList<>());

            list.add(s);
            groups.put(occ, list);
            

        }

        return new ArrayList<>(groups.values());
        
    }
}
