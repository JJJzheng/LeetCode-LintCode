public class RectCover {
    public static void main(final String[] args) {
        System.out.println(rectCover(5));
    }
    public static int rectCover(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;

        int x = 3;
        int fn1 = 1;
        int fn2 = 2;
        int fn = 0;
        while (x <= target) {
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
            x++;
        }
        return fn;
    }
}
