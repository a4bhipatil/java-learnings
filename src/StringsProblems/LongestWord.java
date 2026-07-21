package StringsProblems;

import java.util.*;
public class LongestWord{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        String max=" ";
        for(int i=0; i<a.length; i++){
            if(max.length()<a[i].length()){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}