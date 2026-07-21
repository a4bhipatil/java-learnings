package StringsProblems;
import java.util.*;
public class FindingCountOfLetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        char l=sc.next().charAt(0);
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==l){
                count++;
            }
        }
        System.out.println(count);
    }
}
