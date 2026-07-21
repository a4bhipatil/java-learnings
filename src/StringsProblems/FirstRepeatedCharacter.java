package StringsProblems;

import java.util.*;
public class FirstRepeatedCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=s.charAt(0);
        for(int i=0; i<s.length(); i++){
            int count=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            boolean found=false;
            for(int j=0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    found =true;
                }
            }
            if(count>1){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}