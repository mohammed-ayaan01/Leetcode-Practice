class Solution {
    public boolean isValid(String s) {
        boolean flag = false;
        Stack<Character> st = new Stack<>();

        for(int i = 0;i < s.length();i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' ){
                if(st.isEmpty() || st.peek() != '(' ){
                    return false;
                }
                st.pop();
            }
            if(s.charAt(i) == ']' ){
                if(st.isEmpty() || st.peek() != '['){
                    return false;
                }
                st.pop();
            }
            if(s.charAt(i) == '}' ){
                if(st.isEmpty()  || st.peek() != '{'){
                    return false;
                }
                st.pop();
            }            



            
        }
        return st.isEmpty();
    }
}