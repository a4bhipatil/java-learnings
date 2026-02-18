import java.util.Arrays;
import java.util.Scanner;

public class ReversanArrayandNum_Method {
    static int Revers(int n){
        int revers=0;
        while(n>0){
            int r=n%10;
            revers=revers*10+r;
            n=n/10;
        }
        return revers;
    }
    static int[] Revers(int A[]){
        int B[] =new int[A.length];
        for(int i=A.length-1,j=0; i>=0; i--,j++){
            B[j]=A[i];
        }
        return B;
    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int result=Revers(n);
//        System.out.println(result);
//    }

     public static void main(String[] args) {
         int A[]={2,5,6,7,4,8,9,4};
         int[] B=Revers(A);
         for (int x:B)
             System.out.print(x+" ");
    }
}
