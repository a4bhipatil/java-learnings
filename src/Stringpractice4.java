import java.lang.*;
import java.util.*;

import static java.util.Collections.replaceAll;

public class Stringpractice4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //find if a number is binary or not
//        String i="00001010";
//        System.out.println(i.matches("[01]*"));
//        System.out.println(i.matches("[01]+"));

        //find is a number is hexadecimal or not
//        String num=sc.nextLine();
//        System.out.println(num.matches("[0-9A-Fa-f]+"));

        //find is the date in date format(dd/mm/yyyy)
//       String dob="25/03/2004";
//       System.out.println(dob.matches("[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]"));

        //Remove the special character from the String (^=not)
//        String str=sc.nextLine();
//        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        //Remove extra spaces from string
//        String str=sc.nextLine();
//        System.out.println(str.replaceAll("\\s+"," "));

        //Find number of words in a String
        String str=sc.nextLine();
        str=str.replaceAll("\\s+"," ").trim();
        String wordcount[]=str.split("\\s");
        System.out.println(wordcount.length);
    }
}
