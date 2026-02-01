import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        //Factorial of a Number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int fact=sc.nextInt();
        long result=1;
        for(int i=1; i<=fact; i++){
            result =result*i;
        }
        System.out.println("Factorial of "+fact+" Number is: "+result);
    }
}
