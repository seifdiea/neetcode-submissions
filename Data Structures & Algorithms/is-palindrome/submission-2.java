class Solution {

    boolean isValidChar(char c){
        if((c>'A' && c<'z') || (c>='0' && c<='9'))
            return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);
        int i=0;
        int j=s.length()-1;

        while(i<j){
            System.out.println("Entered");
            char l = s.charAt(i);
            char r = s.charAt(j);

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

            System.out.println(l + " " + r);
            if(r!=l)
                return false;

            i++;
            j--;
        }

        return true;
        
    }
}
