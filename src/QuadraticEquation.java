import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double r1, r2;

        System.out.println("Enter the value of a, b, c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double d = b*b - 4*a*c;   // discriminant

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        }
        else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2*a);
            r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots are: R1 = " + r1 + " and R2 = " + r2);
        }
        else if (d == 0) {
            r1 = -b / (2.0*a);
            System.out.println("Roots are equal: R = " + r1);
        }
        else {
            System.out.println("Roots are imaginary (no real roots)");
        }
    }
}
