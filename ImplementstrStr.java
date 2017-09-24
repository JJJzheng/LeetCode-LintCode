public class ImplementstrStr {
    public static void main(final String[] args) {

    }

    /**
     * 判断 hay 当中是否存在 need 如果有 返回第一次出现的位置
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null)
            return 0;
        if (haystack == null || haystack.length() < needle.length())
            return -1;

        if (!haystack.contains(needle))
            return -1;
        boolean flag = false;
        int i;
        for (i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if (j == needle.length())
                return i;
        }
        return -1;
    }
    public int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }
    }
}
