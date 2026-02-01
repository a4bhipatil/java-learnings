import java.util.Scanner;
public class Sum_of_N_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Find sum of n numbers
        System.out.println("Enter the numbers");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of "+n+" Numbers is: "+sum);
    }
}
