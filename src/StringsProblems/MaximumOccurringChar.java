package StringsProblems;

import java.util.*;
public class MaximumOccurringChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char max=s.charAt(0);
        int maxcount=0;
        for(int i=0; i<s.length(); i++){
            int count=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                max=s.charAt(i);
            }
        }
        System.out.println(max);
    }
}