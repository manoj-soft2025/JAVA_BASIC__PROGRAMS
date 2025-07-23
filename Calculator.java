import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter your first num :- ");
int a =sc.nextInt();
System.out.println("Enter your second number");
int b = sc.nextInt();
System.out.println("Enter your symbol ");
char oparator = sc.next().charAt(0);

switch (oparator){
     case  '+':
        System.out.println(a+b);
        break;
    case  '-':
        System.out.println(a-b);
        break;
    case  '*':
        System.out.println(a*b);
        break;
    case  '/':
        System.out.println(a/b);
        break;
    case  '%':
        System.out.println(a%b);
        break;
    default:
        throw new AssertionError();
}
    }
    }

