class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder msg = new StringBuilder();
        for(String s : strs){
            msg.append(""+s.length()+"-"+s);
        }
        return msg.toString();

    }

    public List<String> decode(String str) {
    List<String> sol = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        String num = "";

        while (str.charAt(i) != '-') {
            num += str.charAt(i);
            i++;
        }

        int l = Integer.parseInt(num);
        i++; 

        sol.add(str.substring(i, i + l));
        i += l;
    }

    return sol;
}


}
