import java.util.Arrays;

public class isContinuous {
    public static void main(final String[] args) {
        int[] a = {0,0,0,0,0};
        System.out.println(isContinuous(a));
    }
    public static boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length != 5)
            return false;
//        Arrays.sort(numbers);
        int[] other = new int[15];
        int min = 14;
        int max = -1;
        for (int i = 0; i < 5; i++) {
            other[numbers[i]]++;
            if (numbers[i] != 0 && other[numbers[i]] > 1)
                return false;
            if (numbers[i] == 0)
                continue;
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];

            if (max - min >= 5)
                return false;

        }
        System.out.println(max);
        System.out.println(min);
        return true;
    }
}
