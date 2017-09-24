import java.util.Scanner;

public class CTripe {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(getPNSum(in.nextInt()));
        }
    }

    public static int getPNSum(int num) {
        int sum = 0;
        if (check(num - 2))
            ++sum;
        for (int i = 3; i <= (num / 2); i += 2) {
            if (check(i) && check(num - i))
                ++sum;
        }
        return sum;
    }
    public static boolean check(int num) {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
