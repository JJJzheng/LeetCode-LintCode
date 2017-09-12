import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static void main(final String[] args) {

    }
    ArrayList<String> ans = new ArrayList<>();

    void dfs(int x, int l, String str, String digits, String phone[]) {
        if (x == l) {
            ans.add(str);
            return;
        }
        int d = digits.charAt(x) - '0';
        for (char c : phone[d].toCharArray()) {
            dfs(x + 1, l, str + c, digits, phone);
        }
    }

    public ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        String phone[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if (digits.length() == 0) {
            return ans;
        }
        dfs(0, digits.length(), "", digits, phone);
        return ans;
    }

}
