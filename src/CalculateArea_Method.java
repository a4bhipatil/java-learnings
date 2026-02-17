import java.util.Scanner;

public class CalculateArea_Method {
    static double Area(int x,int y,int z){
        double s=(x+y+z)/2f;
        double area=(Math.sqrt(s*(s-x)*(s-y)*(s-z)));
        return area;
    }
    static double Area(double l ,double b){
        double area=l*b;
        return area;
    }
    static double Area(double r){
        double area=Math.PI*r*r;
        return area;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double result=Area(a,b,c);
        System.out.println(result);

        double x=sc.nextInt();
        double y=sc.nextInt();
        double result1=Area(x,y);
        System.out.println(result1);

        double r=sc.nextInt();
        double result2=Area(r);
        System.out.println(result);
    }

}
