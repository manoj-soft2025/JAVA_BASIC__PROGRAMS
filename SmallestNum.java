import java.util.Scanner;
public class SmallestNum {
    public static void main(String[] args) {
        int Smallest=9;
    
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:-");
int number= sc.nextInt();
  
while(number>0){
    int rem =number%10;
if(rem<Smallest){
    Smallest=rem;
}
number /=10;
}

System.out.println("The smallest number is:-"+Smallest);
    }
}
