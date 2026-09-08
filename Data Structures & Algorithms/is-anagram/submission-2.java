class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> count = new HashMap<>();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(int i=0;i<s.length();i++){
            count.put(sChar[i], count.getOrDefault(sChar[i],0)+1);
        }

        for(int j=0;j<t.length();j++){
            count.put(tChar[j], count.getOrDefault(tChar[j],0)-1);
        }
        

        for(int x: count.values()){
            if(x!=0) return false;
        }

        return true;

    }
}
