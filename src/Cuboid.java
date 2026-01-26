import java.util.*;
public class Cuboid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length,breadth,height;
        int volume,area;
        System.out.println("Enter length,breadth,height of the cuboid");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        area=2*(length*breadth+length*height+breadth*height);
        volume=length*breadth*height;
        System.out.println("Ther area and volume of cuboid is: "+area+" and "+volume);
    }
}

