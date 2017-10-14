import java.util.Scanner;

public class Coin {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int[] coin = new int[6];
        int num = 0;
        while (in.hasNext()) {
            for (int i = 0; i < 6; i++)
                coin[i] = in.nextInt();
            num = in.nextInt();
            find(coin, num);
        }
    }

    public static void find(int[] coin, int num) {
        int[] res = {1,5,10,50,100,500};
        int ans = 0;
        for (int i = 5; i >= 0; i--) {
            int t = Math.min(num / res[i], coin[i]);
            num -= t * res[i];
            ans += t;
        }
        if (num == 0)
            System.out.println(ans);
        else System.out.println("NOWAY");
    }
}
