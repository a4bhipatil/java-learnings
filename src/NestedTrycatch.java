import java.util.Scanner;

public class NestedTrycatch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        for(int i=0; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        try{
            int r=A[0]/A[2];
            System.out.println(r);
            try{
                System.out.println(A[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index");
            }
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        System.out.println("bye");
    }
}
