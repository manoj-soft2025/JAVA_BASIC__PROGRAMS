
import java.util.Scanner;

public class StrongNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :-");
        int num = sc.nextInt();

        int sum = 0;

        int Original_Num = num;

        while (num > 0) {
            int rem = num % 10;

            int fact = 1;
            for (int i = 1; i <= rem; i++) {

                fact *= i;
            }

            sum += fact;

            num /= 10;

        }
        if (sum == Original_Num) {
            System.out.println(Original_Num + "  is a strong number ");
        } else {
            System.out.println(Original_Num + "  is a not strong number");
        }

    }

}
