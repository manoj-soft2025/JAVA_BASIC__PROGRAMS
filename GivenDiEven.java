import java.util.Scanner;
public class GivenDiEven {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Your digits :-");
        int num = se.nextInt();
 int count =0;




while(num!=0){
   int rem=num %10;
   if(num%2==0){
    System.out.print(rem+" , ");
    count++;
    
   }
   num/=10;
}

System.out.println("even digits are "+count ) ;
        }
   }
    

