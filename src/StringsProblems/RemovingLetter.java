package StringsProblems;

import java.util.Scanner;

public class RemovingLetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==ch){
                continue;
            }else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
