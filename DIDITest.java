import java.math.BigDecimal;
import java.util.Scanner;

public class DIDITest {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            BigDecimal r = in.nextBigDecimal();
            int n = in.nextInt();
            getPow(r, n);
        }
    }
    public static void getPow(BigDecimal r, int n) {
        r = r.pow(n).stripTrailingZeros();
        String str = r.toPlainString();
        if (str.charAt(0) == '0')
                str = str.substring(1);
        System.out.println(str);
    }
}
