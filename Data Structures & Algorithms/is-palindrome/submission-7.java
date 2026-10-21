class Solution {

    boolean isValidChar(char c){
        if((c>='A' && c<='z') || (c>='0' && c<='9'))
            return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        
        
        int i=0;
        int j=s.length()-1;

        while(i<j){
            char l = s.charAt(i);
            char r = s.charAt(j);
            System.out.println(l + " " + r);
            if(!isValidChar(l) && !isValidChar(r)){
                i++;
                j--;
                continue;
            }

            if(!isValidChar(l)){
                i++;
                continue;
            }

            if(!isValidChar(r)){
                j--;
                continue;
            }

            
            if (Character.toLowerCase(r) != Character.toLowerCase(l)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
        
    }
}
