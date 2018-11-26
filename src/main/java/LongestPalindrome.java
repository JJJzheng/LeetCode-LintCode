public class LongestPalindrome {
    public String longestPalindrome(String s) {
        // write your code here
        int length = s.length();
        int maxLength = 0;
        int start = 0;
        boolean[][] p = new boolean[50][50];
        for (int i = 0; i < length; i++) {
            p[i][i] = true;
            if (i < length - 1 && s.charAt(i) == s.charAt(i + 1)) {
                p[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int len = 3; len < length; len++) {
            for (int i = 0; i < length - len; i++) {
                int j = i + len - 1;
                if (p[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    p[i][j] = true;
                    maxLength = len;
                    start = i;
                }
            }
        }
        if (maxLength >= 2)
            return s.substring(start, maxLength);
        return null;
    }
}
