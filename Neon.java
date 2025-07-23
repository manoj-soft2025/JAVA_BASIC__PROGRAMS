import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(" Enter your number ");
int num= sc.nextInt();
        int suare =num*num;
        int sum=0;
        while(suare!=0){
        int rem =suare%10;
        sum+=rem;
        suare/=10;

        }
        if(num==sum){
            System.out.println(num+" is a Neon number !");
        }else{
            System.out.println(num+" is a not Neon Number ");
        }
    }
}
