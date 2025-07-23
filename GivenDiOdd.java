import java.util.Scanner;
public class GivenDiOdd {
    public static void main(String[] args) {
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your digits ");
int num = sc.nextInt();

while(num>0){

    int rem = num%10;

    if(num%2!=0){
        System.out.println("odd num "+rem+",");
count++;

    }
    num/=10;
}
System.out.println("total odd digits "+count);
    }
}
