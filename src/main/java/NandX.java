import java.util.Scanner;

public class NandX {
    public static void main(final String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextInt();
        long x = 0;
        long t = 0;
        int sum = 0;
        for (long i = n + 1; i > 0; i++) {
            x = i; t = i;
            sum = 0;
            while (t > 0) {
                sum += t % 10;
                t /= 10;
            }
//            System.out.println("SUM: " + sum + "  x: " + x);
            if ((x - sum) >= n)
                break;

        }
        System.out.println(x);
        System.exit(0);
    }
}
