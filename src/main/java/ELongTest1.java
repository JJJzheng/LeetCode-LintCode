import java.util.Scanner;

public class ELongTest1 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t > 0) {
            int n = in.nextInt();
            int[] E = new int[n];
            int[] S = new int[n];
            int[] W = new int[n];
            int[] N = new int[n];

            for (int i = 0; i < n; i++)
                E[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                S[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                W[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                N[i] = in.nextInt();


            int sum = 0;
            int now = 0;
            String ans;
            String res = "";
            for (int i = 0; i < n; i++) {
                ans = "E";
                now = E[i];
                if (now > S[i]) {
                    ans = "S";
                    now = S[i];
                }
                if (now > W[i]) {
                    ans = "W";
                    now = W[i];
                }
                if (now > N[i]) {
                    ans = "N";
                    now = N[i];
                }

//                System.out.println(i + " " + ans + " " + now);
                res += ans;
                sum += now;

            }
            System.out.println(sum);
            System.out.println(res);
            t--;
        }
    }
}
