import java.util.Scanner;

public class FindingNumbySumPalindrome {
    static long reverse(long n){
        long rev=0;
        while(n>0){
            long r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    static boolean ispalindrome(long n){
        return n==reverse(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        while(true) {
            long rev = reverse(n);
            //System.out.println(rev);
            long sum = n + rev;
            if (ispalindrome(sum)) {
                System.out.println(sum);
                break;
            }
            n=sum;
        }
        sc.close();
    }
}
