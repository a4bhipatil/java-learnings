import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to fibonacci series");
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+","+b+",");
        for(int i=0; i<=n; i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
