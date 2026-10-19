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
        StringBuilder num = new StringBuilder();

        while (str.charAt(i) != '-') {
            num.append(str.charAt(i));
            i++;
        }

        int l = Integer.parseInt(num.toString());
        i++; 

        sol.add(str.substring(i, i + l));
        i += l;
    }

    return sol;
}


}
