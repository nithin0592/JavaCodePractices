
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        char poped;
        if (s == null || s.length() == 1) {
            return false;
        } else if (s == "") {
            return true;
        } else {

            for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {

                    case '{':
                        stack.push('{');
                        break;
                    case '[':
                        stack.push('[');
                        break;
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if (stack.empty()) return false;
                        poped = stack.pop();
                        if (poped != '(') return false;
                        break;
                    case '}':
                        if (stack.empty()) return false;
                        poped = stack.pop();
                        if (poped != '{') return false;
                        break;

                    case ']':
                        if (stack.empty()) return false;
                        poped = stack.pop();
                        if (poped != '[') return false;
                        break;
                    default:
                }

            }

            if (stack.empty()) {
                return true;
            } else {
                return false;
            }

        }
    }
}
