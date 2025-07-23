import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input as strings
        String startStr = sc.next();
        String endStr = sc.next();

        // Convert strings to integers
        int start = Integer.parseInt(startStr);
        int end = Integer.parseInt(endStr);

        // Determine direction
        if (start <= end) {
            int i = start;
            while (i <= end) {
                System.out.println(i);
                if (i == 2) {
                    break;
                }
                i++;
            }
        } else {
            int i = start;
            while (i >= end) {
                System.out.println(i);
                if (i == 2) {
                    break;
                }
                i--;
            }}}}