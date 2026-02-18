import java.util.Scanner;

public class ValidateNameandAge_Method {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        System.out.println(validate(name));
        int age=sc.nextInt();
        System.out.println(validate(age));

    }
}
