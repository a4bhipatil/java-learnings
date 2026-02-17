import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int revers=0;
        while(n>0){
            int r=n%10;
            revers=revers*10+r;
            n=n/10;
        }
        System.out.print(revers);
    }
}
