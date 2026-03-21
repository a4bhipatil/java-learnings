import java.lang.Exception;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        try{
            int r=A[0]/A[2];
            System.out.println(r);
            System.out.println(A[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        catch (Exception e){
            System.out.println("Invalid index");
        }
        System.out.println("bye");
    }
}
