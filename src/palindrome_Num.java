import java.util.Scanner;

public class palindrome_Num {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int m=n;
            int revers=0;
            while(n>0){
                int r=n%10;
                revers=revers*10+r;
                n=n/10;
            }
            if(revers==m){
                System.out.print("It is a palindrome: "+revers);
            }
            else{
                System.out.println("It is not a palindrome: "+revers);
            }
        }
    }


