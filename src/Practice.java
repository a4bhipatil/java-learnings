import java.util.Scanner;

public class Practice {
   int gcd(int x,int y){
       while(x!=y){
           if(x>y)
               x=x-y;
           else
               y=y-x;
       }
       return x;
   }
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       Practice mc=new Practice();
       System.out.println(mc.gcd(a,b));
   }
}
