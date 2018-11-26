import java.util.TreeSet;

public class LongestSubstring {
    public static void main(final String[] args) {
        System.out.println(lengthOfLongestSubstring("gehmbfqmozbpripibusbezagafqtypz"));
    }

    /**
     * 最长无重复的子串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s == null || s.length() == 0)
            return 0;
        int max = 0, pre = 0;
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }
            else {
                if (set.size() > max)
                    max = set.size();
                while (s.charAt(pre) != s.charAt(i)) {
                    set.remove(s.charAt(pre));
                    pre++;
                }
                set.remove(s.charAt(pre));
                set.add(s.charAt(i));
                pre++;
            }
        }

        if (set.size() > max)
            max = set.size();
        return max;
    }
}
