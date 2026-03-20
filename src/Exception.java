import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero,try again "+e);
        }
        System.out.println("bye");
    }
}
