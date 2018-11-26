public class CutRope {
    public static void main(final String[] args) {

    }
    public int maxProduct_solution(int length) {
        int[] product = new int[length + 1];
        product[0] = 0;
        product[1] = 1;
        product[2] = 2;
        product[3] = 3;
        int max = 0;
        for (int i = 4; i <= length; i++) {
            max = 0;
            for (int j = i; j <= i / 2; i++) {
                int num = product[j] * product[i - j];
                if (max < num)
                    max = num;

                product[i] = max;
            }
        }
        max = product[length];
        return max;

    }

}
