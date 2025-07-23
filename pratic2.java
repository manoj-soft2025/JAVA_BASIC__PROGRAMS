import java.util.Scanner;
public class pratic2 {
    public static void main(String[] args) {
       
int firstLargest =0;
int SecondLargest =0;
Scanner sc = new Scanner(System.in);
System.out.println("enter your number  ");
int number =sc.nextInt();
while(number!=0){

    int rem =number%10;
    if(firstLargest<rem){
         firstLargest=SecondLargest;
         firstLargest=rem;
        
       

    }
    if(SecondLargest<rem && firstLargest != rem){

        SecondLargest=rem;
       

    }
    number=number/10;

    
}
System.out.println(firstLargest);
System.out.println(SecondLargest);

    }
}
