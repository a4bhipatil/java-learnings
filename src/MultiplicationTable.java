import java.util.Scanner;

public class Loop_problems {
    public static void main(String[] args) {
        //Display Multiplication table
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number for multiplication table");
//        int num=sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(num+" X "+i+" = "+(num*i));
//        }

        //Find sum of n numbers
//        System.out.println("Enter the numbers");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum+i;
//        }
//        System.out.println("Sum of "+n+" Numbers is: "+sum);

        //Factorial of a Number
        System.out.println("Enter the number for factorial");
        int fact=sc.nextInt();
        long result=1;
        for(int i=1; i<=fact; i++){
            result =result*i;
        }
        System.out.println("Factorial of "+fact+" Number is: "+result);
    }
}
