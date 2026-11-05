class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);

            switch (b) {
                case '(': st.push(b); break;
                case '[': st.push(b); break;
                case '{': st.push(b); break;

                case ')':
                    if (st.isEmpty() || st.peek() != '(') return false;
                    st.pop();
                    break;

                case ']':
                    if (st.isEmpty() || st.peek() != '[') return false;
                    st.pop();
                    break;

                case '}':
                    if (st.isEmpty() || st.peek() != '{') return false;
                    st.pop();
                    break;
            }
        }

        return st.isEmpty();
    }
}