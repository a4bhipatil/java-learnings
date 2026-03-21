import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        for(int i=A.length()-1; i>=0; i--){
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev))
            System.out.println("it ais a palindrome");
        else
            System.out.println("it is not palindrome");
    }
}
