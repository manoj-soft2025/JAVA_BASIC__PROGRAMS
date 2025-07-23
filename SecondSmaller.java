import java.util.Scanner;
public class SecondSmaller {
    public static void main(String[] args) {
        int firstSmaller= 9;
        int SecondSmaller =9;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number ");
int n =sc.nextInt();
        while(n>0){
       int rem = n%10;
       if(firstSmaller>rem){
        firstSmaller=SecondSmaller;
        firstSmaller=rem;
        
       }
       if(SecondSmaller>rem && firstSmaller !=rem){
        SecondSmaller=rem;
       }
       n=n/10;
        }

        System.out.println("FirstsmallNum "+firstSmaller );
        System.out.println("SecondSmallerNum "+SecondSmaller);
    }
}
