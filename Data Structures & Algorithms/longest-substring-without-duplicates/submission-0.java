class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> chars = new HashSet<>();

        int max = 0;

        
        int j=0;

        for(int i=0;i<s.length();i++){
            
            while(chars.contains(s.charAt(i))){
                chars.remove(s.charAt(j++));
            }
            chars.add(s.charAt(i));
            max = Math.max(max, i-j+1);
        }

        return max;
        
        
    }
}
