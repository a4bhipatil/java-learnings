package StringsProblems;
import java.util.*;
public class ContingNumberOfLowercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        char ch=s.charAt(0);
        int count=0;
        for(int i=0; i<s.length(); i++){
            // if(s.charAt(i)>='a' && s.charAt(i)<='z'){ OR
            if(Character.isLowerCase(s.charAt(i))){
                System.out.print(s.charAt(i));
                count++;
            }
        }
        System.out.print(count);
    }
}
