import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Game360 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int time = in.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++)
                game[i] = in.nextInt();
            findTime(game, time);
        }
    }

    /*public static void findTime(int[] nums, int time) {
        Arrays.sort(nums);
        if (time <= nums[0]) {
            System.out.println(nums[nums.length - 1]);
            return;
        }
        int ans = 0;
        int i = 0;
        int n = nums.length;
        while (time > 0) {
            if (n == 0)
                break;
            if ((time - nums[i]) > 0) {
                time -= nums[i];
                ans += nums[i];
                i++;
                n--;
            } else {
                ans += nums[nums.length - 1];
                break;
            }
        }
        System.out.println(ans);
    }*/

    public static void findTime(int[] nums, int time) {
        Arrays.sort(nums);


    }
}
