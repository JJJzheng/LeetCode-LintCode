import java.util.Scanner;

public class SFTest01 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();
            for (int i = 0; i < n - 1; i++) {
                System.out.println(a[i] + a[i + 1]);
            }
            System.out.println(a[n - 1]);
        }
    }
}
