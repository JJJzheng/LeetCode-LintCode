import java.util.Scanner;

public class FindPattern {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "";
        String parttern = "";
        while (in.hasNext()) {
            text = in.next();
            parttern = in.next();
            find(text, parttern);
        }
    }
    public static void find(String text, String parttern) {
        int pre = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == parttern.charAt(j)) {
                if (j == 0)
                    pre = i;
                j++;
                if (j == parttern.length()) {
                    j = 0;
                    if (min > (i - pre)) {
                        start = pre;
                        min = Math.min(min, i - pre);
                    }
                    i = pre;
                }
            }
        }
        if (min == Integer.MAX_VALUE)
            System.out.println(-1 + " " + -1);
        else System.out.println(start + " " + (start + min));
    }
}
