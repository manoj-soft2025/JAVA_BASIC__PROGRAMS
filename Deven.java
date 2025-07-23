import java.util.Scanner;

public class Deven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        // Take input with validation: 1 < n < 100
        do {
            System.out.print("Enter a number (1 < n < 100): ");
            n = scanner.nextInt();
        } while (n <= 1 || n >= 100);
        
        int count = 0;
        int i = 1;
        
        do {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        } while (i <= n);
        
        System.out.println("Number of even numbers from 1 to " + n + " is: " + count);
    }
}
