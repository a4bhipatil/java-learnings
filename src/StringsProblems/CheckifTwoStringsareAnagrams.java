package StringsProblems;

import java.util.*;
public class CheckifTwoStringsareAnagrams{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("No");
            return;
        }
        boolean flag=true;
        for(int i=0; i<s1.length(); i++){
            int count1=0;
            int count2=0;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count1++;
                }
            }
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count2++;
                }
            }
            if(count1!=count2){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}