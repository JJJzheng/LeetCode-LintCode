import java.util.Stack;

public class ValidParentheses {
    public static void main(final String[] args) {
        System.out.println(isValid("(())"));
    }
    /**
     * 题目大意：括号匹配
     * @param s
     * @return
     */
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        if (s == null || s.length() < 2)
            return false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(')');
            else if (ch == '[')
                stack.push(']');
            else if (ch == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
        return stack.isEmpty();
    }
}
