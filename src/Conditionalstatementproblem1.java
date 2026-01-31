import java.util.*;
public class Conditionalstatementproblem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Day number");
//        int num=sc.nextInt();
//        if(num==1){
//            System.out.println("Monday");
//        } else if (num==2) {
//            System.out.println("Tuesday");
//        } else if (num==3) {
//            System.out.println("wednesday");
//        } else if (num==4) {
//            System.out.println("Thursday");
//        } else if (num==5) {
//            System.out.println("Friday");
//        } else if (num==6) {
//            System.out.println("Saturday");
//        } else if (num==7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid day number");
//        }

        //Find type of website and the protocol used
//        System.out.println("Enter the url");
//        String url=sc.nextLine();
//        String protocol=url.substring(0,url.indexOf(":"));
//        if(protocol.equals("http")){
//            System.out.println("Hyper text protocol");
//        }else if(protocol.equals("ftp")) {
//            System.out.println("File transfer protocol");
//        }
//
//        String ext=url.substring(url.lastIndexOf(".")+1);
//        if(ext.equals("com")){
//            System.out.println("commarcial website");
//        } else if (ext.equals("org")) {
//            System.out.println("Organization");
//
//        }


        //Make a menu Driven program for Arithmetic operation
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        int add = 0,sub=0,multi=0,divi=0;
        System.out.println("Choose the option for Arithmetic operation");
        String option=sc.nextLine();
        option=option.toUpperCase();
        add=a+b;
        sub=a-b;
        multi=a*b;
        divi=a/b;
        switch (option){
            case "ADD":System.out.println("Addition of two numbers: "+add);
                break;
            case "SUB":System.out.println("substraction of two numbers: "+sub);
                break;
            case "MULTI":System.out.println("multiplication of two numbers: "+multi);
                break;
            case "DIVI":System.out.println("division of two numbers: "+divi);
                break;
            default:System.out.println("Invalid option");
                break;
        }

    }
}
