package StringsProblems;

import java.util.*;
public class CountingAlphNumSpcha{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0,k=0,g=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'||ch>='A' && ch<='Z'){
                count++;
            }else if(ch>='0' && ch<='9'){
                k++;
            }else{
                g++;
            }
        }
        System.out.println("alphabets: "+count+" numbers: "+k+" special character: "+g);
    }
}