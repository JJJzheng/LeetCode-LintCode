import java.util.ArrayList;
import java.util.Collections;

public class PermutationString {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();

        if (str != null && str.length() > 0) {
            DFS(str.toCharArray(), 0, list);
            Collections.sort(list);
        }

        return list;

    }
    public static void DFS(char[] ch, int i, ArrayList<String> list) {
        if (i == ch.length - 1) {
            if (!list.contains(String.valueOf(ch)))
                list.add(String.valueOf(ch));
        } else {
            for (int j = i; j < ch.length; j++) {
                swap(ch,i, j);
                DFS(ch, i + 1, list);
                swap(ch, i, j);
            }
        }
    }
    public static void swap(char[] ch, int i, int j) {
        char a = ch[i];
        ch[i] = ch[j];
        ch[j] = a;
    }
}
