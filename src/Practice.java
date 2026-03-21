import java.util.*;
public class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int reverse=0;
        while(n>0){
            int r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        if(reverse==m)
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }
}