
import java.util.Scanner;

public class Pratic {
    public static void main(String[] args) {
        
  Scanner sc = new Scanner (System.in);
  //System.out.println("enter you color ");
//   String color= sc.nextLine().toLowerCase();
// String blue,red,green;
//   if(color .equals("green")){
//     System.out.println("the color is green");
//   }
//   else if (color.equals("red")){
// System.out.println("The color is red");
//   }
// else  if(color.equals("blue")){
//     System.out.println("The color is blue");
// }
// else{
//     System.out.println("the color is not red,green ,blue");


// }
// System.out.println("enter student marks :- ");
// char Grade;

// int mark = sc.nextInt();
// if(mark>=35 && mark<=40 ){
//  Grade='E';
//  System.out.println( "The grade is "+Grade);
// } else if(mark>=40 && mark<=50 ){
// Grade='D';
// System.out.println( "The grade is "+Grade);
// }
// else if(mark >=50 && mark<=60){
//     Grade='C';
//     System.out.println( "The grade is "+Grade);
// }
// else if(mark>=60 && mark<=70){
//     Grade='b';
//     System.out.println( "The grade is "+Grade);
// }
// else if( mark >=70 && mark<=80){
//     Grade='B';
//     System.out.println( "The grade is "+Grade);
// }
// else if(mark >=80 && mark<=90){
//     Grade='a';
//     System.out.println( "The grade is "+Grade);
// }else if(mark >=90 && mark<=100){
// Grade='A';
// System.out.println( "The grade is "+Grade);
// }
// else{
//     System.out.println("the student is fail  ");
// }

System.out.println("Enter your number :- ");

int num = sc.nextInt();

if(num %50 ==0){
    System.out.println(num+" The number is multple of 50 ");
}
else{
    System.out.println(num +" The number is non multiple of 50  ");
}

}}

