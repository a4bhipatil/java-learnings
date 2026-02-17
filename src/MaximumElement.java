import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the maximum element in the array");
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max=A[0];
        for(int i=0; i<A.length; i++){
            if(max<A[i])
                max=A[i];
        }
        System.out.print(max);
    }
}
