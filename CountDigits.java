import java.util.Scanner;



public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yr digits ");
        int num = sc.nextInt();
      int   count=0;
      
while(num!=0){
   int rem =num%10; 
   num =num/10;
   System.out.println(rem+" ");
    count++;
}

System.out.println(count+"  total are");
  }


}
