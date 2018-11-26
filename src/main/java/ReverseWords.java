import java.util.Stack;

public class ReverseWords {
    public static void main(final String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    /**
     * 翻转字符串
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        // write your code here
        if (s == null)
            return null;
        Stack<String> stack = new Stack<>();
        String[] arr = s.split(" ");
        for (String a : arr)
            stack.push(a);
        String result = "";
        for (int i = 0; i < arr.length; i++)
            result += stack.pop() + " ";
        return result;
        /*for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop().toString();
        }
        return result;*/
    }
}
