//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class expression {
    public static void main(String[] var0) {
    //    Scanner var4 = new Scanner(System.in);
    //    System.out.println("Enter the Base and hight");
    //    float var1 = var4.nextFloat();
    //    float var2 = var4.nextFloat();
    //    float var3 = var2 * var1 / 2.0F;
    //    System.out.println("Area of a Traingle is " + var3);
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;
        System.out.println("Enter the sides of triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is: "+area);
    }
}
