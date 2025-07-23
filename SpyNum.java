public class SpyNum {
    public static void main(String[] args) {
        int num =1435;
        int product =1;
        int sum=0;
       int temp =num;
       while(temp>0){

        int rem = temp%10;
         sum+=rem;
         product*=rem;
         temp/=10;  
 }
       if(sum==product){
        System.out.println(num+" is a spy number");
       }else{
        System.out.print(num+" not a spy number");
       }
      
    }
   
}
