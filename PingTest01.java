import java.util.Arrays;
import java.util.Scanner;

public class PingTest01 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (n < k) {
                System.out.println("error");
//                return;
                continue;
            }

            int[] low = new int[n];
            int[] high = new int[n];

            for (int i = 0; i < n; i++) {
                low[i] = in.nextInt();
                high[i] = in.nextInt();
            }


            Arrays.sort(low);
            Arrays.sort(high);

            System.out.println(low[n - k - 1] + " " + high[n - k - 1]);
        }
    }
}
