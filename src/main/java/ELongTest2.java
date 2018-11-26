import java.util.Scanner;

public class ELongTest2 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int[] num = new int[n];

            for (int i = 0; i < n; i++)
                num[i] = in.nextInt();
            System.out.println(check(num) ? "Luck sequence" : "Unl5uck sequence");
        }

    }
    public static boolean check(int[] num) {
        int[] arr = new int[num.length];
        for (int i = 0; i < num.length - 1; i++) {
            int now = Math.abs(num[i] - num[i + 1]);
            if (now >= num.length || arr[now] != 0)
                return false;
            arr[now]++;
        }
        return true;
    }


}
