import java.util.Scanner;

public class MoguTest {
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            getData(year, month, day);
        }
    }
    public static void getData(int year, int month, int day) {
        int febDays = 28;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            febDays = 29;
        int data = 0;
        switch (month) {
            case 1:
                data = day;
                break;
            case 2:
                data = 31 + day;
                break;
            case 3:
                data = 31 + febDays + day;
                break;
            case 4:
                data = 31 + febDays + 31 + day;
                break;
            case 5:
                data = 31 + febDays + 31 + 30 + day;
                break;
            case 6:
                data = 31 + febDays + 31 + 30 + 31 + day;
                break;
            case 7:
                data = 31 + febDays + 31 + 30 + 31 + 30 + day;
                break;
            case 8:
                data = 31 + febDays + 31 + 30 + 31 + 30 + 31 + day;
                break;
            case 9:
                data = 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + day;
                break;
            case 10:
                data = 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
                break;
            case 11:
                data = 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
                break;
            case 12:
                data = 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        }
        System.out.println(data);
    }
}
