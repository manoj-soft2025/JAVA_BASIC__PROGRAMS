import java.util.Scanner;
public class LargestDigit {

    public static void main(String[] args) {
        int larNum=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();

        while(number>0){
            int rem= number%10;
            if(larNum<rem){
                larNum=rem;
            }
            number/=10;
        }
        System.out.println("the largest:-"+larNum);

    }
}
