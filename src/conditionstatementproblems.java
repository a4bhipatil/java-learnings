import java.lang.*;
import java.util.*;
public class conditionstatementproblems {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       //find largest in 3 numbers
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        if(a>b&&a>c){
//            System.out.println("largest number is a: "+a);
//        }
//        else if(b>c) {
//                System.out.println("largest number is b: " + b);
//            }
//        else{
//            System.out.println("largest number is c:"+c);
//        }

        //Check the given number is odd or even
//        int n=sc.nextInt();
//        if(n%2==0){
//            System.out.println("The number is even: "+n);
//        }
//        else{
//            System.out.println("Ther number is odd: "+n);
//        }


        //Check the person is young or not young
//        int person=sc.nextInt();
//        if(person<=14 && person<=55){
//            System.out.println("The person is not young");
//        }
//        else{
//            System.out.println("The person is a young");
//        }

        // find grades for given marks
//        int m1=sc.nextInt();
//        int m2=sc.nextInt();
//        int m3=sc.nextInt();
//        int total=m1+m2+m3;
//        int average=total/3;
//        if(average>=70){
//            System.out.println("Ther grade is A");
//        }
//        else if(average>=60 && average<70){
//            System.out.println("The grade is B");
//        }
//        else if(average>=60 && average<50){
//            System.out.println("The grade is C");
//        } else if (average>=40 && average<50) {
//            System.out.println("Ther grade is D");
//        } else {
//            System.out.println("The grade is F");
//        }

        //Find radix of a number given in a string
//        System.out.println("Enter the number");
//        String num=sc.nextLine();
//        if(num.matches("[01]+")){
//            System.out.println("Binary radix:2");
//        }
//        else if(num.matches("[0-7]+")){
//            System.out.println("octal radix:8");
//        }
//        else if(num.matches("[0-9A-F]+")){
//            System.out.println("Hexadecimal radix:16");
//        }
//        else if(num.matches("[0-9]+")){
//            System.out.println("Decimal radix:10");
//        }
//        else {
//            System.out.println("Invalid number");
//        }


        //Find a given number is leap year
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a leap year");
                }else {
                    System.out.println("It is not a leap year");
                }
            }else {
                System.out.println("It is leap Year");
            }
        }
        else {
            System.out.println("it is not leap year");
        }
    }
}
