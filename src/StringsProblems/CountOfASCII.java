package StringsProblems;
import java.util.*;
public class CountOfASCII {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0; i<s.length(); i++){
            count+=(int)s.charAt(i);
        }
        System.out.println(count);
    }
}
