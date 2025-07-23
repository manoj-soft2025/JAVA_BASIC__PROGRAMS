import java.util.Scanner;
public class EvenNum {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your number");
   int number = sc.nextInt();

   if(number %2==0){
    System.out.println("its even numbers"+number);
   }else{
    System.out.println("odd number "+number);
   }
}
}
