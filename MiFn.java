import java.util.Scanner;

public class MiFn {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            fibonacci(n);
        }
    }

    public static void fibonacci(int n) {
        /*if (n < 2)
            return 1;
        if (n == 2)
            return 2;*/
        if (n == 0) {
            System.out.println(1);
            return;
        }
        int fn1 = 0;
        int fn2 = 1;
        int ans = fn1 + fn2;
        int i = 1;
        while (i <= n) {
            ans = fn1 + fn2;
            fn1 = fn2;
            fn2 = ans;
            i++;
        }
        System.out.println(ans);
    }
}
